import java.awt.*;
import java.applet.*;
/*
<applet code="P25" width=500 height=200>
</applet>
 */
public class P25 extends Applet implements Runnable
{
    String msg = " Hello World :This is My first Banner Program ";
    Thread t=null;
    boolean stopflag;

    public void init()
    {
        setForeground(Color.red);
    }

    public void start()
    {
        t=new Thread(this);
        stopflag=false;
        t.start();
    }

    public void run()
    {
        for( ; ; )
        {
            try
            {
                repaint();
                Thread.sleep(500);
                if(stopflag)
                {
                    break;
                }
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }

    public void paint(Graphics g)
    {
        Font f=new Font("Segoe Script",Font.BOLD,34);
        g.setFont(f);
        char ch;
        ch=msg.charAt(0);
        msg=msg.substring(1);
        msg+=ch;
        g.drawString(msg, 10, 100);
        showStatus("This is show in status window");
    }
}

