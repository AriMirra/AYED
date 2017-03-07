import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by arimi on 04-Mar-17.
 */
public class MainMenu extends JFrame {

    //labels
    private JLabel titulo = new JLabel("Trabajo Práctico Swing");
    private JLabel subtitulo = new JLabel("Ariel Mirra");
    private JLabel subtitulo2 = new JLabel("Franco Velardez");

    //buttons
    private JButton startGame = new JButton("Start Game");
    private JButton settings = new JButton("Settings");
    private JButton exit = new JButton("Exit");

    //constructor
    public MainMenu() throws HeadlessException {
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
        setResizable(false);
        setVisible(true);
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

    //show and hide window
    public void showSelf(){
        setVisible(true);
    }
    public void hideSelf(){
        setVisible(false);
    }

}
