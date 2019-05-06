/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p18;
import java.util.Scanner;
/**
 *
 * @author rj
 */
public class P18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {    
            System.out.println("A Program 'DivideByZero' that takes two numbers a and b as input, computes a/b, and invokes Arithmetic Exception to generate a message when the denominator is zero.");   
            int a,b,c;
            Scanner inp=new Scanner(System.in);
            System.out.println("Enter the two numbers a and b respectively:");
            a=inp.nextInt();
            b=inp.nextInt();
            c=a/b;
            System.out.println("a/b="+c); 
           }
           catch(ArithmeticException e)
           {
            System.out.println("Error:"+e);           
           }        
        }
    
}
