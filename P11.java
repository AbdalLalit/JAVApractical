/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11;

/**
 *
 * @author rj
 */
class overload
{
    double length,breadth;
    void area()
    {
        System.out.println(" Method 1.....");
        System.out.println(" No dimensions found....");
    }
    void area(double x,double y)
    {
        length=x;
        breadth=y;
        System.out.println(" Method 2......");
        System.out.println(" The length ="+ length +" and the breadth ="+breadth);
        System.out.println(" Area of the figure is...."+(length *breadth));
    }
    
    void area(int dim)
    {
        System.out.println(" Method 3.....");
        length=breadth=dim;
        System.out.println(" Area of the figure is....."+(dim*dim));
    }
    double area(double a)
    {
        length=breadth=a;
        System.out.println(" Method 4......");
        System.out.println(" The length ="+ length +" and the breadth ="+breadth);
        return a*a;
    }
}
public class P11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        overload ob1=new overload();
        System.out.println(" Method 1 is executed as no dimensions are passed....");
        ob1.area();
        System.out.println(" Method 2 is executed as the passed arguments are of type double.....");
        ob1.area(10.5,20.2);
        int i=8,j=6;
        System.out.println(" Method 2 is executed even when integer arguments are passed because of automatic type conversion......");
        ob1.area(i,j);
        System.out.println(" Method 3 is executed even when a byte argument is passed because of automatic type conversion......");
        byte b=2;
        ob1.area(b);
        double  result,z=6;
        result = ob1.area(z);
        System.out.println(" Method 4 is executed beacuse it returns a value and we pass a double type of argument......");
        System.out.println(" The area of the triangle is...."+result);
    }
    
}
