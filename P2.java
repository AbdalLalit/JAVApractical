/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;
import java.util.Scanner;

/**
 *
 * @author rj
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,fact=1;
        System.out.println("Enter the number whose factorial you want to print...");
        Scanner sr=new Scanner(System.in);
        num=sr.nextInt();
        System.out.println("Factorial of "+num+" is...");
        
        for(int i=num;i>=1;i--)
        {
            fact*=i;
        }
        System.out.println(fact);
   
    }
    
}
