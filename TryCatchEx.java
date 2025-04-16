//07-04-2025

class TryCatchEx{
    public static void main(String args[])
    {
        try{
            int a=10,b=0;
            int c = a/b;
            System.out.println("Result is:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Caught an exception!\n" + e.getMessage());
        }
        System.out.println("End of program");
    }
}