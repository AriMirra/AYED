package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by arimi on 04-Mar-17.
 */

/**
 * MainMenu class is the MainMenu window, has all its components and methods
 */
public class MainMenu extends JFrame {

    //labels
    private JLabel titulo = new JLabel("Trabajo Práctico Swing");
    private JLabel subtitulo = new JLabel("Ariel Mirra");
    private JLabel subtitulo2 = new JLabel("Franco Velardez");

    //buttons
    private JButton startGame = new JButton("Start View.Game");
    private JButton settings = new JButton("View.Settings");
    private JButton exit = new JButton("Exit");

    /**
     * the constructor initiates it's components, and organizes them in their correct order
     * @throws HeadlessException
     */
    //constructor
    public MainMenu() throws HeadlessException {
        super("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
        titulo.setFont(new Font("font",Font.BOLD,17));


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

    /**
     * the methods adds listeners to the buttons and the show/hide methods
     * @param listener
     */
    //add listeners to buttons
    public void addStartGameListener(ActionListener listener){
        startGame.addActionListener(listener);
    }

    public void addSettingsListener(ActionListener listener){
        settings.addActionListener(listener);
    }

    public void addExitListener(ActionListener listener){
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
