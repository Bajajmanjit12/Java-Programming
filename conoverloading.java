//constructor overloading program

class conoverloading{
    int id;
    String name;
    int age;

    conoverloading(int i,String n)
    {
        id =i;
        name = n;
    }

    conoverloading(int i,String n,int a)
    {
        id = i;
        name = n;
        age = a;
    }

    void display()
    {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[])
    {
        conoverloading obj = new conoverloading(1,"Manjit");
        conoverloading obj1 = new conoverloading(2,"unnati",20);
        obj.display();
        obj1.display();
    }
}