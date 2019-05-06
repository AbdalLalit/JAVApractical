/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p9;
import java.util.Scanner;

class distance
{
    int feet=0,inches=0;
    char cho='y';
    void calcdis()
    {
        int feet,inches;
        do
        {
            System.out.println(" Enter the distance in any of the following units....\n 1. cm \n 2. mm \n 3. inches \n 4. metres \n 5. kilometres ");
            System.out.print(" Enter your choice.... ");
            Scanner sr=new Scanner(System.in);
            int ch=sr.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print(" Enter the distance in cm...");
                    float cm=sr.nextInt();
                    System.out.println(" The distance in cm is...."+ cm +" cm");
                    inches=(int)(cm/2.54);
                    feet=(int)(inches/12);
                    inches=inches%12;
                    System.out.println(" The distance in feet and inches is(local variables )...."+ feet +" feet "+ inches +" inches");
                    System.out.println(" The value of globally defined feet ="+ this.feet +" and inches ="+ this.inches );
                    break;
                case 2:
                    System.out.print(" Enter the distance in mm...");
                    float mm=sr.nextInt();
                    System.out.println(" The distance in cm is...."+ mm +" mm");
                    inches=(int)(mm/25.4);
                    feet=(int)(inches/12);
                    inches=inches%12;
                    System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                    System.out.println(" The value of globally defined feet ="+ this.feet +" and inches ="+ this.inches );
                    break;
                case 3:
                    System.out.print(" Enter the distance in inches...");
                    inches=sr.nextInt();
                    System.out.println(" The distance in cm is...."+ inches +" inches");
                    feet=(int)(inches/12);
                    inches=inches%12;
                    System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                    System.out.println(" The value of globally defined feet ="+ this.feet +" and inches ="+ this.inches );
                    break;
                case 4:
                    System.out.print(" Enter the distance in metres...");
                    float metres=sr.nextInt();
                    System.out.println(" The distance in cm is...."+ metres +" m");
                    inches=(int)(metres*39.37);
                    feet=(int)(inches/12);
                    inches=inches%12;
                    System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                    System.out.println(" The value of globally defined feet ="+ this.feet +" and inches ="+ this.inches );
                    break;
                case 5:
                    System.out.print(" Enter the distance in kilometres...");
                    float km=sr.nextInt();
                    System.out.println(" The distance in cm is...."+ km +" km");
                    inches=(int)(km*39370.079);
                    feet=(int)(inches/12);
                    inches=inches%12;
                    System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                    System.out.println(" The value of globally defined feet ="+ this.feet +" and inches ="+ this.inches );
                    break;
                default:
                    System.out.println(" Invalid choice !!!!!");

         
            }
        System.out.print(" Do you want to continue(y/n)....");
        cho=sr.next().charAt(0);
        }while(cho=='y'||cho=='Y');
    }
}


public class P9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" ****************** Program to create a \"distance\" class with methods where distance is computed in terms of feet and inches  how to create the objects and the use of the this pointer  ************ ");
        distance ob=new distance();
        ob.calcdis();
    }
    
}
