import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]args)
    {
        //Arthemetic 
          int a = 10;
          int b = 5;
          int sum = a+b;
          System.out.println("The sum is:"+sum);
          
          int multi = a*b;
          System.out.println("The multiplied value is:"+multi);
          
          int diff = a-b;
          System.out.println("The difference value is:"+diff);
          
          //unary
          int c=1;
          System.out.println(++c);
          System.out.println(c);
          
          System.out.println(c++);
          System.out.println(c);
          
          // Relational
          System.out.println(a == b);
          System.out.println(a < b);
          System.out.println(a > b);
          System.out.println(a != b);
          
         Scanner scan = new Scanner(System.in);
         System.out.println("enter your age :");
          int age= scan.nextInt();
          System.out.println( "The age is :"+age);
          String e = (age <=18) ? "WARNING:MINOR":"status:Adult";// true or false
        System.out.println(e);
         
          
          
          

          
          
          
          
          
    }
}