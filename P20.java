/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p20;
import java.util.Scanner;

/**
 *
 * @author rj
 */
public class P20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("A Program to create your own exception types to handle situation specific to your application(Hint: Define a subclass of which itself is a subclass of throwable).");   
        System.out.print("Enter a postive integer:");
        try//block
        {    
         Scanner inp=new Scanner(System.in);
         int n=inp.nextInt();
         if(n<0) throw new Myexception("Negative Number!");
         if(n==0) throw new Myexception1("Zero Entered!");
        }
        catch(Myexception | Myexception1 e)//function // 1try mcatch, mtry 1catch, mtry mcatch
        {
         e.printStackTrace();
        } 
        /* or 
        catch(Myexception1 e1)
        {
         e1.printStackTrace();
        }*/    
    }
    
}

class Myexception extends Exception//Exception class doesn't includes throw by itself. It extends throwable class to include throw.
{
        String str;
        Myexception(String str)
        {
         this.str=str;//this is used when we refer to the global not local.   
        }
        public String toString()//We are overwriting the toString function of the Exception class in our program by defining it again.
        {
         return("User defined exception:"+str);   
        }        
}

class Myexception1 extends Exception
{
        String str1;
        Myexception1(String str1)
        {
         this.str1=str1;   
        }
        public String toString()
        {
         return("User defined exception 1:"+str1);   
        }        
}



