import java.util.Scanner;

/**
 * Write a description of class examination here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class examination
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks");
        int marks = sc.nextInt();
       
        if(marks>=40)
        {
           System.out.println("You have passed");
        }
       
        else
        {
            System.out.println("You have failed");
        }
    }
}