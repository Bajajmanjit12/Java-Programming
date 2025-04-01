class type_const{
    int id;
    String name;
    type_const(int i,String n)
    {
        id = i;
        name = n;
    }

    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        type_const s = new type_const(1,"abc");
        type_const s1 = new type_const(2,"xyz");
        s.display();
        s1.display();

    }
}