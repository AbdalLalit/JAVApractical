/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p19;

/**
 *
 * @author rj
 */
public class P19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               System.out.println("A Program to show the use of nested try statements that emphasizes the sequence of checking for catch handler statements.");
               int ar[]={3,8,9,1,9};
               System.out.println("5th element of the array is:"+ar[4]);
               try
              {    
                    try
                    {    
                        int result=ar[4]/0;
                        System.out.println("Resultof division:"+result);
                    }
                    catch(ArithmeticException e2)
                    {
                        e2.printStackTrace();
                    }
                    System.out.println("5th element of the array is:"+ar[5]);
                    }
                    catch(ArrayIndexOutOfBoundsException e1)//Exception keyword is used if we don't know which exception to use.
                    {         
                    e1.printStackTrace();
                    }
                    System.out.println("Hello World");
             }
    }
    

