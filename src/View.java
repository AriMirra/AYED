import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by arimi on 04-Mar-17.
 */
public class View extends JFrame {

    //labels
    private JLabel titulo = new JLabel("Trabajo Práctico Swing");
    private JLabel subtitulo = new JLabel("Ariel Mirra");
    private JLabel subtitulo2 = new JLabel("Franco Velardez");

    //buttons
    private JButton startGame = new JButton("Start Game");
    private JButton settings = new JButton("Settings");
    private JButton exit = new JButton("Exit");

    //constructor
    public View() throws HeadlessException {
        super("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));

        //center all components
        startGame.setAlignmentX(CENTER_ALIGNMENT);
        settings.setAlignmentX(CENTER_ALIGNMENT);
        exit.setAlignmentX(CENTER_ALIGNMENT);
        titulo.setAlignmentX(CENTER_ALIGNMENT);
        subtitulo.setAlignmentX(CENTER_ALIGNMENT);
        subtitulo2.setAlignmentX(CENTER_ALIGNMENT);

        //add components to panel and add space between them
        panel.add(Box.createVerticalGlue());
        panel.add(titulo);
        panel.add(Box.createVerticalStrut(20));
        panel.add(subtitulo);
        panel.add(Box.createVerticalStrut(20));
        panel.add(subtitulo2);
        panel.add(Box.createVerticalStrut(20));
        panel.add(startGame);
        panel.add(Box.createVerticalStrut(20));
        panel.add(settings);
        panel.add(Box.createVerticalStrut(20));
        panel.add(exit);
        panel.add(Box.createVerticalGlue());
        panel.setVisible(true);

        //add panel to frame and pack it
        add(panel);
        pack();
    }


    //add listeners to buttons
    void addStartGameListener(ActionListener listener){

        startGame.addActionListener(listener);

    }

    void addSettingsListener(ActionListener listener){

        settings.addActionListener(listener);

    }

    void addExitListener(ActionListener listener){

        exit.addActionListener(listener);

    }


    //create another window for Settings
    public class SettingsWindow extends JFrame{

        private JLabel settings = new JLabel("Settings");
        private JCheckBox soundBox = new JCheckBox("On",true);
        private JCheckBox soundBox2 = new JCheckBox("Off",false);
        private JCheckBox musicBox = new JCheckBox("On ",true);
        private JCheckBox musicBox2 = new JCheckBox("Off ",false);
        private JLabel sound = new JLabel("Sound: ");
        private JLabel music = new JLabel("Music: ");

        public SettingsWindow() throws HeadlessException {

            settings.setAlignmentX(Component.CENTER_ALIGNMENT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //create and customize panel to be shown
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout(15,15));
            panel.add(settings, BorderLayout.PAGE_START);
            panel.add(sound,BorderLayout.LINE_START);
            panel.add(music,BorderLayout.LINE_START);
            panel.add(soundBox,BorderLayout.CENTER);
            panel.add(soundBox2,BorderLayout.CENTER);
            panel.add(musicBox,BorderLayout.CENTER);
            panel.add(musicBox2,BorderLayout.CENTER);

            this.pack();
            panel.setVisible(true);
        }


    }



}
