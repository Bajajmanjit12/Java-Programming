//07-04-2025

class MulCatchBlock{
    public static void main(String args[])
    {
        try{
            int a[] = new int[10];
            a[10] =30/1;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occured!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound occurs!");
        }
        catch(Exception e)
        {
            System.out.println("Parent exception occurs!");
        }
        System.out.println("End of program");
    }
}