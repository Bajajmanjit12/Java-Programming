import java.util.Scanner;
//function overloading program
class algebra{
    int add(int a,int b)
    {
        return a+b;
    }

    double add(double a,double b)
    {
        return a+b;
    }
}

class function_overloading{
    public static void main(String args[])
    {
        int n1,n2;
        double n3,n4;
        algebra obj = new algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the two integers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        System.out.println(obj.add(n1,n2));

        System.out.println("\nEnter the two double integers:");
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        System.out.println(obj.add(n3,n4));
    }
}