/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;
import java.util.Scanner;

/**
 *
 * @author rj
 */
public class P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,temp=0;
        int[] arr;
        arr=new int[20];
        System.out.println("Enter the decimal number....");
        Scanner sr=new Scanner(System.in);
        num=sr.nextInt();
        int j=num;
        for(int i=0;j>0;i++)
        {
            arr[i]=j%2;
            j/=2;
            temp++;
        }
        for(int i=temp; i>=0;i--)
        {
           System.out.print(arr[i]);
        }
        
    }
    
}
