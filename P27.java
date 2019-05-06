import java.awt.*;
import java.awt.Event;
import java.applet.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class P27 extends Applet implements MouseListener, MouseMotionListener{
    String msg="";
    int mouseX=0,mouseY=0;
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        mouseX=0;
        mouseY=10;
        msg="Mouse Clicked at positions ("+mouseX+","+mouseY+")";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX=0;
        mouseY=10;
        msg="Mouse Pressed ";
        repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX=0;
        mouseY=10;
        msg="Mouse Released ";
        repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX=0;
        mouseY=10;
        msg="Mouse Entered the applet";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseX=0;
        mouseY=10;
        msg="Mouse Exited the applet";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="*";
        showStatus("Mouse Dragged at ("+mouseX+","+mouseY+")");
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="*";
        showStatus("Mouse Moving at ("+mouseX+","+mouseY+")");
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg,mouseX,mouseY);
    }
}