
/**
 * Write a description of class condition here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class condition
{
  public static void main(String[]args)
    {
        int age=17;
        System.out.println("welcome to our world");
       
        if(age>=18) //for one condition just use if
        {
           System.out.println(age);
        }
        else if(age < 18) // for more than two conditions use if-else-if ladder
        {
          System.out.println("less than 18");  
        }
        else // for two condition use if-else
        {
            System.out.println("invalid age");
        }
        System.out.println("Control flow statement");
       
       
        int num=15;
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

       
        int no=10;
       
        switch(no) // switch
        {
            case 10: System.out.println("Number is 10");
            break;
            case 20: System.out.println("Number is 20");
            break;
        }
       
    }
}   
