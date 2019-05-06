/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;
import java.util.Scanner;

/**
 *
 * @author rj
 */
public class P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char var='y';
        System.out.println("Program to show the working of different functions of String and StringBufferclass like setCharAt(),setLength(),append(),insert(),concat() and equals().");
        Scanner inp=new Scanner(System.in); 
        System.out.print("Please enter the string....");
        StringBuffer str=new StringBuffer(inp.next());
        System.out.println("The string entered is: "+str);
        do
        {
            System.out.println(" **************MAIN MENU *********************\n 1. To insert a character at a specified position of the entered string.;\n 2. To show the specified length of the entered string.;\n 3. To add a character or another string at the end of the entered string;\n 4. To insert a character or another string at a specified position of the entered string.;\n 5. To concat two strings after entering them and to show the resultant string ;\n 6. To check whether the entered two strings are exactly the same or not.;");
            System.out.print(" Enter your choice....");
            int n=inp.nextInt();
            
           
            switch(n)
            {
                case 1:System.out.println("Showing the working of setCharAt().......");
                       System.out.print("Enter the position where the new character needs to be replaced..... ");
                       int pos1=inp.nextInt();
                       System.out.print("Enter the character to be placed at position "+pos1+"..... ");
                       char ch=inp.next().charAt(0);
                       str.setCharAt(pos1, ch);
                       System.out.println("The corrected string is..... "+str);
                       break;

                case 2:System.out.println("Showing the working of setLength().......");
                       System.out.print("Enter the length of the string to be displayed: ");
                       int pos2=inp.nextInt();
                       str.setLength(pos2);
                       System.out.println("The modified string is: "+str);
                       break;

                case 3:System.out.println("Showing the working of append()........");
                       System.out.print("Enter the string that you wanna add in the existing string.... "); 
                       StringBuffer strapp=new StringBuffer(inp.next());
                       str.append(strapp);
                       System.out.println("Modified String is..... "+str );
                       break;

                case 4:System.out.println("Showing the working of insert()........");
                       System.out.println("Enter the position at which a character or a string needs to be inserted.....");
                       int pos4=inp.nextInt();
                       System.out.println("Enter the character or a string to be inserted at position "+pos4+"....");
                       StringBuffer strins=new StringBuffer(inp.next());
                       str.insert(pos4, strins);
                       System.out.println("Modified String is....."+str);
                       break;

                case 5:System.out.println("Showing the working of concat().......");        
                       String strcatt1=str.toString();
                       System.out.print("Enter the second string to be concatenated with the entered string: ");
                       StringBuffer strcat2=new StringBuffer(inp.next());
                       String strcatt2=strcat2.toString();
                       String strcatt3=strcatt1.concat(strcatt2);
                       System.out.println("Modified String is:"+strcatt3);
                       break;

                case 6:System.out.println("Showing the working of equals().....");        
                       System.out.println("Checks whether the entered two strings are equal or not.....");
                       String strreq1=str.toString();
                       System.out.print("Enter the second string.....");
                       StringBuffer streq2=new StringBuffer(inp.next());
                       String strreq2=streq2.toString();
                       boolean x=strreq1.equals(strreq2);
                       if(x)
                       {
                        System.out.println("Strings are equal");        
                       }
                       else
                       System.out.println("Strings are not equal");    
                       break;

                default:System.out.println("Invalid Entry!!!!!  Please enter again...."); 
                        break;            
            } 
            System.out.print("Do you want to continue(y/n)....");
            var=inp.next().charAt(0);   

        
        }while(var=='y'||var=='Y');
    
    }
}
