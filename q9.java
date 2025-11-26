import java.util.Scanner;

/**
 * Write a description of class q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q9
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter your GPA");
        float GPA = sc.nextFloat();
        System.out.print("Enter your attendance percentage ");
        float attendance = sc.nextFloat(); 
        System.out.print("Enter your attitude score");
        int attitude = sc.nextInt(); 
        if(GPA>=3.2 && GPA<=4.0)
        {
           if(attendance>=80)
           {
               if (attitude<5)
               {
                  System.out.println("Eligible for Scholarship");
               }
               else
               {
                  System.out.println("Attitude Not enough");
               }
           }
           else
           {
               System.out.println("Attendance Not enough");
           }
        }
        else
        {
            System.out.println("Not eligible scholarship");
        }
        }
     }

