import java.util.Scanner;

/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5
{
    public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = sc.nextInt();
        
            if(num%3==0)
        {
           if(num%5==0) // nested if
           {
               System.out.println("divisible by 3 and 5");
           }
           else
           {
               System.out.println("divisible by 3 but not 5");
           }
        }
        else
        {
            System.out.println("not divisible by 3 and 5");
        }
}
}