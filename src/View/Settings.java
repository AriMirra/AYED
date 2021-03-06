package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by arimi on 07-Mar-17.
 */

/**
 * Settings class is the Settings window, has all its components and methods
 */
public class Settings extends JFrame{
    private JLabel settings = new JLabel("Settings");
    private JCheckBox shadows = new JCheckBox("Shadows",true);
    private JCheckBox antiAliasing = new JCheckBox("AntiAliasing",false);
    private JLabel sound = new JLabel("Sound: ");
    private JLabel music = new JLabel("Music: ");
    private JRadioButton soundOn = new JRadioButton("on",true);
    private JRadioButton musicOn = new JRadioButton("on",true);
    private JRadioButton soundOff = new JRadioButton("off",false);
    private JRadioButton musicOff = new JRadioButton("off",false);
    private ButtonGroup soundButtons = new ButtonGroup();
    private ButtonGroup musicButtons = new ButtonGroup();
    private JButton back = new JButton("Back");
    private JLabel graphics = new JLabel("Graphics: ");

    public Settings() throws HeadlessException {

        /**
         * the constructor initiates it's components, creates a panel for every menu that can be changed,
         * and organizes them in their correct order
         */
        settings.setAlignmentX(Component.CENTER_ALIGNMENT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        back.setAlignmentX(CENTER_ALIGNMENT);
        graphics.setAlignmentX(RIGHT_ALIGNMENT);
        //sound panel
        JPanel soundPanel = new JPanel();
        soundPanel.setLayout(new BoxLayout(soundPanel, BoxLayout.X_AXIS));
        soundPanel.add(sound);
        soundPanel.add(soundOn);
        soundPanel.add(soundOff);
        soundButtons.add(soundOn);
        soundButtons.add(soundOff);
        //Music panel
        JPanel musicPanel = new JPanel();
        musicPanel.setLayout(new BoxLayout(musicPanel, BoxLayout.X_AXIS));
        musicPanel.add(music);
        musicPanel.add(musicOn);
        musicPanel.add(musicOff);
        musicButtons.add(musicOn);
        musicButtons.add(musicOff);
        //checkboxes panel
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.X_AXIS));
        checkBoxPanel.add(shadows);
        checkBoxPanel.add(antiAliasing);
        //create and customize panel to be shown
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(settings);
        panel.add(soundPanel);
        panel.add(musicPanel);
        panel.add(graphics);
        panel.add(checkBoxPanel);
        panel.add(back);
        //add panel to window, pack and show
        add(panel);
        pack();
        setResizable(false);
        setVisible(false);
    }

    /**
     * turns the window visible
     */
    public void showSelf(){
        setVisible(true);
    }

    /**
     * turns the window invisible
     */
    public void hideSelf(){
        setVisible(false);
    }

    //add listener to buttons
    /**
     * add a listener to the back button
     * @param listener
     */
    public void addBackListener(ActionListener listener){
        back.addActionListener(listener);
    }

    /**
     * add a listener to the sound buttons
     * @param listener
     */
    public void addSoundListener(ActionListener listener){
        soundOn.addActionListener(listener);
        soundOff.addActionListener(listener);
    }

    /**
     * add a listener to the music buttons
     * @param listener
     */
    public void addMusicListener(ActionListener listener){
        musicOn.addActionListener(listener);
        musicOff.addActionListener(listener);
    }

    /**
     * add a listener to the shadows checkbox
     * @param listener
     */
    public void addShadowsListener(ActionListener listener){
        shadows.addActionListener(listener);
    }

    /**
     * add a listener to the antiAliasing checkbox
     * @param listener
     */
    public void addAAListener(ActionListener listener){
        antiAliasing.addActionListener(listener);
    }

    /**
     * returns if the sound is on
     */
    public Boolean isTheSoundOn(){
        return soundButtons.getSelection().equals(soundOn.getModel());
    }

    /**
     * returns if the music is on
     */
    public Boolean isTheMusicOn(){
        return musicButtons.getSelection().equals(musicOn.getModel());
    }
}
