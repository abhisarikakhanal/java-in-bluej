
/**
 * Write a description of class workshop3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop3
{
    int age;
    static int qty;
    
     
    {
        //<className> <variable>=new <className>();
        int age=18;
        workshop3 v1= new workshop3();// calling static variable in static method
        System.out.println(v1.age);
        
        System.out.println(age);
        System.out.println(workshop3.qty);
        
        System.out.println("third week of programming");
        
    }    
}