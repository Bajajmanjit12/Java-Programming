//07-04-2025
public class ThrowEx{
    static void checkage(int age)
    {
        if(age < 18)
        {
        throw new ArithmeticException("Access denied - you must be greater than 18!");
        }
        else
        {
            System.out.println("Access granted - you are old enough!");
        }
    }
    public static void main(String args[])
    {
        checkage(18);
        
    }
}