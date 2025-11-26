import java.util.Scanner;

/**
 * Write a description of class q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q8
{
    public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        float grade = sc.nextInt();
   if(grade>=3.6 && grade<=4.0)
        {
           System.out.println("A+");
        }
        else if(grade>=3.2 && grade<=3.6)
        {
          System.out.println("A");  
        }
        else if(grade>=2.8 && grade<=3.2)
        {
          System.out.println("B+");  
        }
        else if(grade>=2.4 && grade<=2.8)
        {
          System.out.println("B");  
        }
        else if(grade>=2.0 && grade<=2.4)
        {
          System.out.println("C+");  
        }
        else if(grade>=1.6 && grade<=2.0)
        {
          System.out.println("C");  
        }
        else if(grade>=0 && grade<=1.6)
        {
          System.out.println("NG");  
        }
        else
        {
            System.out.println("invalid GPA");
        }
       
    }
}