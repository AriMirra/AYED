import View.Game;
import View.MainMenu;
import View.Settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arimi on 02-Mar-17.
 */

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
    /**
     * creates the classes to add listeners to the buttons on the windows, and their behaviour when clicked
     */
    //implement listeners
    private class startGameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainMenu.hideSelf();
            game.showSelf();
        }
    }
    private class settingsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainMenu.hideSelf();
            settings.showSelf();
        }
    }
    private class exitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    private class backListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            settings.hideSelf();
            mainMenu.showSelf();
        }
    }
    private class shadowsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.shadowsChanged();
        }
    }
    private class antiAliasingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.antiAliasingChanged();
        }
    }
    private class soundListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.soundChanged();
        }
    }
    private class musicListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.musicChanged();
        }
    }
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainMenu.showSelf();
            game.hideSelf();
        }
    }
}
