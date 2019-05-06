/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p14;

/**
 *
 * @author rj
 */
public class P14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("  ******************  Program to demonstate the concept of boxing and unboxing  *************************"); 
        System.out.println("Using Integer a=new Integer(5);");
        Integer a=new Integer(5);
        System.out.println("Value of a using +a.intValue()(Without Autoboxing):"+a.intValue());
        System.out.println("Value of a using +a(Autoboxing):"+a);
        int b=67;
        Integer c=b;
        System.out.println("Value of c from b using +c(Autoboxing):"+c);
        int d=a;
        System.out.println("Value of d from a using int d=a; (Unboxing):"+d);
        int e=a.intValue();
        System.out.println("Value of e from a using int e=a.intValue(); (Without Unboxing):"+e);
        c=20;
        System.out.println("Changed value of c:"+c);
        System.out.println("Changed value of c doesn't change the value of b (Due to autoboxing new c object is created):"+b);
        d=7;
        System.out.println("Changed value of d:"+d);
        System.out.println("Changed value of d doesn't change the value of a (Due to unboxing):"+a);
        }
    
}
