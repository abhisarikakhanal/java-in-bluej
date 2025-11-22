import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("    -----RICKSHAW FARE-----");
       int basefare =25;
       int perkmcharge = 20;
       double permincharge = 2.5;
       
       System.out.println("The basefare is :\t"+basefare);
       System.out.println("The fare per km is :\t"+perkmcharge);
       System.out.println("The basefare per min is :\t"+permincharge);
       
       System.out.println("The travelled distance in km is :");
       double distance= scan.nextInt();
       System.out.println( "The travelled distance in km is:\t"+distance);
       
       System.out.println("The travelled time in min is :");
       double time = scan.nextInt();
       System.out.println( "The travelled time in min is:\t"+time);
       
       System.out.println("The total fare charge is:");
       double tot = basefare + perkmcharge * distance + permincharge * time;
       System.out.println("The total fare charge is:"+tot);
       
       System.out.println("Are you a local?(yes/no)");
       String local = scan.next();
       String a = (local==yes)? " The traveller is a local": " The traveller is not a local";
       
       
       
       
       
    }
}