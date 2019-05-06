/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;
import java.util.Scanner;

/**
 *
 * @author rj
 */
public class P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int[] a1;
        System.out.print("enter the input:");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        while(n<=0)
        {
            System.out.println("enter a valid input");
            n=inp.nextInt();
        }
        a1= new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("enter the " + (i+1) + " element : ");
           a1[i]=inp.nextInt();
           System.out.println();
        }
        System.out.print("The elements of array are : [ ");
        for (int j=0;j<n;j++)
        {
        System.out.print(a1[j]+" ");
        }
        System.out.print("]");
    }
    
}
