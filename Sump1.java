/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sump1;

/**
 *
 * @author rj
 */
public class Sump1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int sum=0;
        for(int i=0; i<args.length;i++)
        {
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("The sum of numbers is..."+sum);
       
    }
    
}
