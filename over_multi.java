class parent{
    void display()
    {
        System.out.println("parent class");

    }
}

class child extends parent{
    void display()
    {
        
        System.out.println("child class");
        super.display(); //here parent class will be display after child class

    }
}

/*class child2 extends parent
{
    void display()
    {
        super.display(); //here parent class wiill be displayed before child class
        System.out.println("2nd child  class");

    }
}*/
class over_multi{
    public static void main(String args[])
    {
        child c = new child();
        c.display();
    }
}