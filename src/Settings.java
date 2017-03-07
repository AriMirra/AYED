import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by arimi on 07-Mar-17.
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

    public Settings() throws HeadlessException {

        settings.setAlignmentX(Component.CENTER_ALIGNMENT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sound panel
        JPanel soundPanel = new JPanel();
        soundPanel.setLayout(new BoxLayout(soundPanel,BoxLayout.X_AXIS));
        soundPanel.add(sound);
        soundPanel.add(soundOn);
        soundPanel.add(soundOff);
        soundButtons.add(soundOn);
        soundButtons.add(soundOff);
        //Music panel
        JPanel musicPanel = new JPanel();
        musicPanel.setLayout(new BoxLayout(musicPanel,BoxLayout.X_AXIS));
        musicPanel.add(music);
        musicPanel.add(musicOn);
        musicPanel.add(musicOff);
        musicButtons.add(musicOn);
        musicButtons.add(musicOff);
        //checkboxes panel
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel,BoxLayout.X_AXIS));
        checkBoxPanel.add(shadows);
        checkBoxPanel.add(antiAliasing);
        //create and customize panel to be shown
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(settings);
        panel.add(soundPanel);
        panel.add(musicPanel);
        panel.add(checkBoxPanel);
        panel.add(back);

        //add panel to window, pack and show
        add(panel);
        pack();
        setResizable(false);
        setVisible(false);
    }

    //show and hide
    public void showSelf(){
        setVisible(true);
    }
    public void hideSelf(){
        setVisible(false);
    }

    //add listener to buttons
    void addBackListener(ActionListener listener){
        back.addActionListener(listener);
    }
    void addShadowsListener(ActionListener listener){
        shadows.addActionListener(listener);
    }
    void addAAListener(ActionListener listener){
        antiAliasing.addActionListener(listener);
    }
}
