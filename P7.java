/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;
import java.util.Scanner;

/**
 *
 * @author rj
 */
public class P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner inp=new Scanner(System.in);
        int n=Integer.parseInt(args[0]);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=inp.nextInt();
        }
        System.out.println(sum);

        
    }
    
}
