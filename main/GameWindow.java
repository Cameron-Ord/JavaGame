package main;
import javax.swing.JFrame;

public class GameWindow {
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel){
        jframe = new JFrame();
        jframe.setSize(400,400);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        //Exits on close
        jframe.setDefaultCloseOperation(3);
    }
}
