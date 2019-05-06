/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21;

/**
 *
 * @author rj
 */

public class P21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread t1=new Thread(new Runnable()
        {
            @Override
            public void run(){
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
        });
        
         Thread t2=new Thread(new Runnable()
        {
            @Override
            public void run()
            {
        int j;
        for(j=11;j<=20;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
        });
         
          Thread t3=new Thread(new Runnable()
        {
            @Override
            public void run(){
        int k;
        for(k=21;k<=30;k++)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
        });
          System.out.println("t1 priority "+t1.getPriority());
          System.out.println("t1 priority "+t2.getPriority());
          System.out.println("t1 priority "+t3.getPriority());
          t2.setPriority(t1.getPriority()+1);
          t1.setPriority(1);
          t3.setPriority(Thread.MAX_PRIORITY);
          t1.start();
          t2.start();
          t3.start();
    }
    
}
