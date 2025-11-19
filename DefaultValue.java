
/**
 * Write a description of class DefaultValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValue
{
    int a;
    short b;
    byte c;
    long d;
    float e;
    double f;
    boolean g;
    char h;
    
    public static void main(String[]args)
    {
        DefaultValue v1 = new DefaultValue();
        System.out.println("int value is:"+v1.a);
        System.out.println("short value is:"+v1.b);
        System.out.println("byte value is:"+v1.c);
        System.out.println("long value is:"+v1.d);
        System.out.println("float value is:"+v1.e);
        System.out.println("double value is:"+v1.f);
        System.out.println("boolean value is:"+v1.g);
        System.out.println("char value is:"+v1.h);
        
    }
}