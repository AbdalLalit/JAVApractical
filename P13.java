/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p13;

/**
 *
 * @author rj
 */
public class P13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("  ^^^^^^^^^^^^^^^^^^^^^^  Program to show the use of Static Functions and to pass variable length arguements in a function   ^^^^^^^^^^^^^^^^^^^^^^^^");   
        P13 ob=new P13();
        System.out.println("Using ob.normfunct(); ");
        ob.normfunct();
        System.out.println("Using statfunct(); ");
        statfunct();
        System.out.println("Using ob.statfunct();");
        ob.statfunct();
        System.out.println("Using the classname as classname.statfunct()...");
        P13.statfunct();
        vararg(10,5,30,100);  
    }
    
     static void statfunct()
     {
         System.out.println("This is a static function.");
     }  
     void normfunct()
    {
         System.out.println("This is a normal function.");    
    }  
    static void vararg(int ...n)
    { 
        int count=1;   
        System.out.println("The number of arguments are...."+n.length);
        System.out.println("Value of the arguements passed are:");
        for(int i:n)
        {
            System.out.print("The arguement "+count+" is :  ");
            System.out.println(i);
            count++;
        }    
    }        
    
}
 