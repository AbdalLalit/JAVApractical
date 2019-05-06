import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class P28 extends Applet implements KeyListener
{
    String msg=" ";
    int x=200 , y=200;

    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent k)
    {
        showStatus("Keydown");
        int key=k.getKeyCode();
        switch(key)
        {
            case KeyEvent.VK_F1:
                msg+="f1";
                break;
            case KeyEvent.VK_F2:
                msg+="f2";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg+="pagedown";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg+="pageup";
                break;
            case KeyEvent.VK_LEFT:
                msg+="leftarrow";
                break;
            case KeyEvent.VK_RIGHT:
                msg+="rightarrow";
                break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent k)
    {
        showStatus("keyup");
    }

    public void keyTyped(KeyEvent k)
    {
        msg+=k.getKeyChar();
        repaint();
    }

    public void paint(Graphics g)
    {
        Font f=new Font(" Segoe Script",Font.BOLD,16);
        g.setFont(f);
        g.drawString(msg,x,y);
    }
}
