import java.util.Scanner;

/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = sc.nextInt();
       
        if(num%2==0)
        {
           System.out.println("It is even");
        }
       
        else
        {
            System.out.println("It is odd");
        }
    }

}