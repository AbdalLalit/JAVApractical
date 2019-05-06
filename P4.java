/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;
import java.util.Scanner;

/**
 *
 * @author rj
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr;
        arr=new int[100][100];
        int m,n;
        System.out.print("Enter the number of rows in the array....");
        Scanner sr=new Scanner(System.in);
        m=sr.nextInt();
        System.out.print("Enter the number of columns in the array....");
        n=sr.nextInt();
        System.out.print("Enter the elements in array....");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sr.nextInt();
                
            }
        }
        System.out.println("The elements in the array are...");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print("   ");
            }
            System.out.println(" ");
        }
        System.out.println("The array after transpose...");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[j][i]);
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    
}
