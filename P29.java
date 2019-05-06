import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class AppWindow extends Frame
{
    String Keymsg="This is a test.";
    String mousemsg=" ";
    int mouseX=30,mouseY=30;

    public AppWindow()
    {
        addKeyListener(new MyKeyAdapter(this));
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    public void paint(Graphics g)
    {
        g.drawString(Keymsg,10,40);
        g.drawString(mousemsg,mouseX,mouseY);
    }

    public static void main(String args[])
    {
        AppWindow ap=new AppWindow();
        ap.setSize(new Dimension(300,200));
        ap.setTitle("An Awt-based Application");
        ap.setVisible(true);
    }

}
public class P29{
    public static void main(String args[])
    {
        AppWindow ap=new AppWindow();
        ap.setSize(new Dimension(300,200));
        ap.setTitle("An Awt-based Application");
        ap.setVisible(true);
    }
}

class MyKeyAdapter extends KeyAdapter
{
    AppWindow app;
    public MyKeyAdapter(AppWindow app)
    {
        this.app=app;
    }

    public void keyTyped(KeyEvent ke)
    {
        app.Keymsg+=ke.getKeyChar();
        app.repaint();
    }
}

class MyMouseAdapter extends MouseAdapter
{	AppWindow app;
    public MyMouseAdapter(AppWindow app)
    {
        this.app=app;
    }

    public void mousePressed(MouseEvent me)
    {
        app.mouseX=me.getX();
        app.mouseY=me.getY();
        app.mousemsg=("Mouse Down at "+ app.mouseX + " , " + app.mouseY);
        app.repaint();
    }
}

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}

