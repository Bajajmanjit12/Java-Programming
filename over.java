class parent{
    void display()
    {
        System.out.println("parent class");

    }
}

class child extends parent{
    void display()
    {
        super.display();
        System.out.println("child class");

    }
}

class over{
    public static void main(String args[])
    {
        child c = new child();
        c.display();
    }
}