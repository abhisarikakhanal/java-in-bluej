import java.util.Scanner;

/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the MP of an product ");
       double mp = sc.nextDouble();
       System.out.println("enter the category of the product ");  
       char ch = sc.next().charAt(0);
       System.out.println(ch);
       double sp=0.0;
       if (ch=='A') 
       {
           sp = mp - ( mp * 0.6);
           System.out.println("The selling price is:"+sp);

       }
       else if(ch =='B')
       {
           sp = mp - ( mp * 0.4);
           System.out.println("The selling price is:"+sp);
       }
       else if (ch=='c')
       {
           sp = mp - ( mp * 0.2);
           System.out.println("The selling price is:"+sp);
       }
       else if (ch =='D')
       {
          sp = mp - ( mp * 0.1);
           System.out.println("The selling price is:"+sp); 
       }
       else
       {
           sp = mp;
           System.out.println("The selling price is:"+sp); 
       }
     }   
}