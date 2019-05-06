/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;
import java.util.Scanner;

/**
 *
 * @author rj
 */
public class P6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num,temp=0;
        System.out.print("Enter the number...");
        Scanner sr=new Scanner(System.in);
        num=sr.nextInt();
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
                temp=1;
        }
        if(temp==0)
        {
            System.out.println("Number "+num+" is prime");
        }
        else 
            System.out.println("Number "+num+" is not prime");
    }
    
}
