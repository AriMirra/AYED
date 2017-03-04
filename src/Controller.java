import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arimi on 02-Mar-17.
 */
public class Controller {
    private Model model = new Model();
    private View view = new View();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        //add listeners to view
        this.view.addStartGameListener(new startGameListener());
        this.view.addSettingsListener(new settingsListener());
        this.view.addExitListener(new exitListener());

    }

    //implement listeners
    private class startGameListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class settingsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class exitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
