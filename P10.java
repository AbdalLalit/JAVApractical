/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10;
import java.util.Scanner;

/**
 *
 * @author rj
 */
class distance implements Cloneable
{
    int feet,inches;
    distance(int x,int y)
    {
        feet=x;
        inches=y;
    }
    distance(distance o)
    {
        feet=o.feet;
        inches=o.inches;
    }
    void display()
    {
        System.out.println(" The value of feet = "+ feet +" and inches ="+ inches );
    }
    
    public Object clone() throws
                   CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
    void calcdis()
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
                System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                break;
            case 2:
                System.out.print(" Enter the distance in mm...");
                float mm=sr.nextInt();
                System.out.println(" The distance in cm is...."+ mm +" mm");
                inches=(int)(mm/25.4);
                feet=(int)(inches/12);
                inches=inches%12;
                System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                break;
            case 3:
                System.out.print(" Enter the distance in inches...");
                inches=sr.nextInt();
                System.out.println(" The distance in cm is...."+ inches +" inches");
                feet=(int)(inches/12);
                inches=inches%12;
                System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                break;
            case 4:
                System.out.print(" Enter the distance in metres...");
                float metres=sr.nextInt();
                System.out.println(" The distance in cm is...."+ metres +" m");
                inches=(int)(metres*39.37);
                feet=(int)(inches/12);
                inches=inches%12;
                System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                break;
            case 5:
                System.out.print(" Enter the distance in kilometres...");
                float km=sr.nextInt();
                System.out.println(" The distance in cm is...."+ km +" km");
                inches=(int)(km*39370.079);
                feet=(int)(inches/12);
                inches=inches%12;
                System.out.println(" The distance in feet and inches is...."+ feet +" feet "+ inches +" inches");
                break;
                
                
        }
    }
}

public class P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        distance ob1=new distance(5,2);
        System.out.println(" The value of feet and inches as assigned by parameterized constructor...");
        ob1.display();
        distance ob2=new distance(4,11);
        System.out.println(" The values of feet and inches when ob2 is declared...");
        ob2.display();
        System.out.println(" The values of feet and inches after assigning  object reference variable....");
        ob2=ob1;
        ob2.display();
        ob2.feet=10;
        ob2.inches=12;
        System.out.print("Now the values of ob2 are...");
        ob2.display();
        System.out.print("The values of ob1 are...");
        ob1.display();
        distance ob3;
        try
        {
            
             ob3=(distance)ob1.clone();
             System.out.print("The values of ob3 (the clonable object of ob1) are....");
             ob3.display();
             ob3.inches=45;
             System.out.print("The values of ob3 after modification are....");
             ob3.display();
             System.out.print("The values of feet and inches ob1 are......");
             ob1.display();
        }
        
       
        catch(Exception e)
        {
             e.printStackTrace();
        }
    }
    
}

