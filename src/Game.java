import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by arimi on 07-Mar-17.
 */
public class Game extends JFrame{


    private BufferedImage myPicture;
    private JLabel image;
    private JButton backButton;

    public Game() {
        try {
            myPicture = ImageIO.read(new File("./Image/gameImage.png"));
        } catch (IOException e) {
            System.out.println("image not found");
        }
        image = new JLabel(new ImageIcon(myPicture));
        backButton = new JButton("Back");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new BoxLayout(gamePanel,BoxLayout.Y_AXIS));
        gamePanel.add(image);
        gamePanel.add(backButton);
        add(gamePanel);
        pack();
    }

    public void addBackButtonListener(ActionListener listener){
        backButton.addActionListener(listener);
    }
    //show and hide
    public void showSelf(){
        setVisible(true);
    }
    public void hideSelf(){
        setVisible(false);
    }


}
