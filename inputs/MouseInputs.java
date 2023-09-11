package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private GamePanel gamePanel;
    public MouseInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }


    @Override
    public void mouseDragged(MouseEvent arg0) {
        gamePanel.setRectPos(arg0.getX(), arg0.getY());
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {

    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
       
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
   
    }
    
}
