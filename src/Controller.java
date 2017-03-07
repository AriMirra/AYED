import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by arimi on 02-Mar-17.
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

        //add listeners to windows
        this.mainMenu.addStartGameListener(new startGameListener());
        this.mainMenu.addSettingsListener(new settingsListener());
        this.mainMenu.addExitListener(new exitListener());
        this.settings.addBackListener(new backListener());
        this.game.addBackButtonListener(new BackButtonListener());

    }

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

        }
    }
    private class antiAliasingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
    private class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainMenu.showSelf();
            game.hideSelf();
        }
    }

}
