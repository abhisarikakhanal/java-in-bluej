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
       double discount = 0.10;
       double surcharge = 0.20;
       
       System.out.println("The basefare is :\t"+basefare);
       System.out.println("The fare per km is :\t"+perkmcharge);
       System.out.println("The basefare per min is :\t"+permincharge);
       System.out.println("the discount for the local is:\t"+discount);
       System.out.println("the surcharge for the nighttravel is:\t"+surcharge);
       
       System.out.println("The travelled distance in km is :");
       double distance= scan.nextInt();
       System.out.println( "The travelled distance in km is:\t"+distance);
       
       System.out.println("The travelled time in min is :");
       double time = scan.nextInt();
       System.out.println( "The travelled time in min is:\t"+time);
       
       System.out.println("The total fare charge is:");
       double tot = basefare + perkmcharge * distance + permincharge * time;
       System.out.println("The total fare charge is:"+tot);
       
       System.out.println("Are you a local?(yes/no)? (1=yes,0=no)");
       int local = scan.nextInt();
       
       System.out.println("Is it nighttime?(yes/no)? (1=yes,0=no)");
       int extra = scan.nextInt();
       
       tot = (local == 1)? ( tot - tot*discount) : tot;
       surcharge  = (extra == 1)? ( tot + (tot*surcharge)) : tot;
        
       System.out.println("the total fare is\t"+tot);
       System.out.println("the total fare after surcharge is\t"+surcharge);
       
    }
}