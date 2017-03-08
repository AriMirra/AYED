import View.Game;
import View.MainMenu;
import View.Settings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * the controller class manages the functionality of the MainMenu, Settings, and Game windows
 * it also adds listeners to the buttons and their behaviour when clicked
 */
public class Controller {
    private Model model;
    private MainMenu mainMenu;
    private Settings settings;
    private Game game;

    public Controller(){
        model = new Model();
        mainMenu = new MainMenu();
        settings = new Settings();
        game = new Game();

        //add listeners to components
        this.mainMenu.addStartGameListener(new startGameListener());
        this.mainMenu.addSettingsListener(new settingsListener());
        this.mainMenu.addExitListener(new exitListener());
        this.settings.addBackListener(new backListener());
        this.game.addBackButtonListener(new BackButtonListener());
        this.settings.addMusicListener(new musicListener());
        this.settings.addSoundListener(new soundListener());
        this.settings.addAAListener(new antiAliasingListener());
        this.settings.addShadowsListener(new shadowsListener());

    }

    //implement listeners
    /**
     * class to add listeners to the startGame button, and implements it's behaviour when clicked
     */
    private class startGameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainMenu.hideSelf();
            game.showSelf();
        }
    }

    /**
     * class to add listeners to the settings button, and implements it's behaviour when clicked
     */
    private class settingsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainMenu.hideSelf();
            settings.showSelf();
        }
    }

    /**
     * class to add listeners to the exit button, and implements it's behaviour when clicked
     */
    private class exitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    /**
     * class to add listeners to the back button, and implements it's behaviour when clicked
     */
    private class backListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            settings.hideSelf();
            mainMenu.showSelf();
        }
    }

    /**
     * class to add listeners to the shadows checkbox, and implements it's behaviour when clicked
     */
    private class shadowsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.shadowsChanged();
        }
    }

    /**
     * class to add listeners to the antiAliasing checkbox, and implements it's behaviour when clicked
     */
    private class antiAliasingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.antiAliasingChanged();
        }
    }

    /**
     * class to add listeners to the sound buttons, and implements it's behaviour when clicked
     */
    private class soundListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.soundChanged(settings.isTheSoundOn());
        }
    }

    /**
     * class to add listeners to the music buttons, and implements it's behaviour when clicked
     */
    private class musicListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.musicChanged(settings.isTheMusicOn());
        }
    }

    /**
     * class to add listeners to the back button on the game window, and implements it's behaviour when clicked
     */
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainMenu.showSelf();
            game.hideSelf();
        }
    }
}
