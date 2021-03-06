package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 * Game class is the game window, has all its components and methods
 */
public class Game extends JFrame{
    private BufferedImage myPicture;
    private JLabel image;
    private JButton backButton;

    /**
     * the constructor creates the panel and orders it
     */
    public Game() {
        try {
            myPicture = ImageIO.read(new File("./Image/gameImage.png"));
        } catch (IOException e) {
            System.out.println("image not found");
        }
        image = new JLabel(new ImageIcon(myPicture));
        backButton = new JButton("Back");
        backButton.setAlignmentX(LEFT_ALIGNMENT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new BoxLayout(gamePanel,BoxLayout.Y_AXIS));
        gamePanel.add(image);
        gamePanel.add(backButton);
        add(gamePanel);
        pack();
    }

    /**
     * adds a listener to the back button
     * @param listener
     */
    public void addBackButtonListener(ActionListener listener){
        backButton.addActionListener(listener);
    }

    //show and hide
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
}
