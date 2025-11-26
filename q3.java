import java.util.Scanner;

/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q3
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = sc.nextInt();
        if(num<0)
        {
           System.out.println("It is negative");
        }
        else if(num==0)
        {
            System.out.println("It is zero");
        }
        else
        {
            System.out.println("It is positive");
        }
         
    }
}