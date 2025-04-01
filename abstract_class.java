import java.util.Scanner;

// Abstract class definition
abstract class shape {
    int l, b,radius; 
    Scanner sc = new Scanner(System.in);
    abstract public void show();
    void accept() {
        System.out.println("Enter the length and breadth:");
        l = sc.nextInt(); 
        b = sc.nextInt();
        
    }

    void accept_rad()
    {
        System.out.println("Enter the radius:");
        radius= sc.nextInt();
    }
}


class rectangle extends shape {
    public void show() 
    {
        System.out.println("Area of rectangle: " + (l * b));
    }
}

class square extends shape{
    public void show()
    {
        System.out.println("area of square having side "+ b +": "+ (l*l));
    }
}
class circle extends shape{
    public void show()
    {
        System.out.println("area of circle :" + (3.14 * radius * radius));
    }
}

public class abstract_class {
    public static void main(String args[]) {
        rectangle r = new rectangle();
        r.accept();
        r.show();

        square s = new square();
        s.accept();
        s.show();

        circle c = new circle();
        c.accept_rad();
        c.show();
    }
}