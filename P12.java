/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open template in the editor.
 */
package p12;


/**
 *
 * @author rj
 */
class accessmem
{
    int  n=10;
    private int  pri_n=20;
    protected int pro_n=30;
    public int pub_n=40;
    accessmem()
    {
        
        System.out.println(" Inside the constructor of accessmem.....");
        System.out.println(" n= "+n);
        System.out.println(" pri_n= "+pri_n);
        System.out.println(" pro_n= "+pro_n);
        System.out.println(" pub_n= "+pub_n);
        
    }
}
class der_accessmem extends accessmem
{
    der_accessmem()
            {
                System.out.println(" **************  Subclass of the same package can access all the members of the baseclass except for the private members *********** ");
                System.out.println(" Inside the constructor of der_accessmem.....");
                System.out.println(" n= "+n);
                System.out.println(" Derived class cannot access the private member of it's baseclass if it does then compile time error will occur....");
            //  System.out.println(" pri_n= "+pri_n);
                System.out.println(" pro_n= "+pro_n);
                System.out.println(" pub_n= "+pub_n);
        
            }
}
class indepen
{
     accessmem obj=new  accessmem();
    indepen()
    {    
         System.out.println(" Inside the constructor of indepen.....");
         System.out.println(" n= "+obj.n);
         System.out.println(" Cannot access the private member of the baseclass of the same package...");
       //System.out.println(" pri_n= "+obj.pri_n);
         System.out.println(" pro_n= "+obj.pro_n);
         System.out.println(" pub_n= "+obj.pub_n);
    }
   
}


class area_of_cir
{
    double rad;
    final double PI=3.147;
    area_of_cir(double r)
    {
        rad=r;
        show();
    }
    void show()
    {
        double area =PI*rad*rad;
        System.out.println(" Area of circle with radius "+ rad + " is = "+area);
        System.out.println(" PI cannot assign a new value beacuse it is declared as final if we does so, then compile time error will occur.....");
      //PI=3.4;
    }
}
class Test
{     
    void meth(int i,int j)
    {
        i*=2;
        j/=2;
    }
}
class Testref
{     
    int a,b;
    Testref(int i,int j)
    {
        a=i;
        b=j;
    }
    void meth(Testref o)
    {
        o.a*=2;
        o.b/=2;
    }
}

public class P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("  *****************  DIFFERENCE BETWEEN PUBLIC AND PRIVATE ACCESS SPECIFIERS  ***************");
        System.out.println();
        System.out.println(" ***************  Same class can access all it's members    *****************");
        der_accessmem ob=new der_accessmem();
        System.out.println(" ***************   Independent class of the same package can access all the members of the base class except for private members    ************ ");
        indepen ob1=new indepen();
        System.out.println();
        System.out.println(" *********************  USE OF FINAL KEYWORD  **********************");
        area_of_cir ar=new area_of_cir(22.7);
        System.out.println();
        System.out.println(" ********************* PRIMITIVE DATA TYPES ARE PASSED BY VALUE AND OBJECTS ARE PASSED BY REFERENCE   **********************");
        System.out.println(" When primitive types are passed......");
        Test ts=new Test();
        int a=10,b=20;
        System.out.println(" a and b before call :" + a + "  "+b);
        ts.meth(a,b);
        System.out.println(" a and b after  call :" + a + "  "+b);
        System.out.println(" When objects are passed.......");
        Testref tref =new Testref(15,20);
        System.out.println(" a and b before call :" + tref.a + "  "+tref.b);
        tref.meth(tref);
        System.out.println(" a and b after  call :" + tref.a + "  "+tref.b);

        
    }
}        
    

