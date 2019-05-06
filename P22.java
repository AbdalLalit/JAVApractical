/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p22;
import java.util.Scanner;

/**
 *
 * @author rj
 */
class Shared{
    public int item=5;
};
class ProdCons{
    public
    Shared s1=new Shared();
    void producer()
    {
        System.out.println("Item number before production : "+s1.item);
        s1.item+=1;
        System.out.println("Item number after production : "+s1.item);
       
    }
        void consumer()
    {
        System.out.println("Item number before consumption : "+s1.item);
        s1.item-=1;
        System.out.println("Item number after consumption : "+s1.item);
        
    }
    
}
public class P22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        
        final ProdCons p1=new ProdCons();
        
        Thread t1=new Thread(new Runnable()
        {
            @Override
            public void run(){
                p1.producer();
        
    }
        });
        
                Thread t2=new Thread(new Runnable()
        {
            @Override
            public void run(){
                p1.consumer();
        
    }
        });
                
                t1.start();
                t2.start();
       
    }
    
}
