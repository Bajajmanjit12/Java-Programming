interface SY{
    void print();
}

class SYa implements SY
{

        public void print()
        {
            System.out.println("hello sy division");
        }
    
}

class Main_interface{
    public static void main(String args[])
    {
        SYa s = new SYa();
        s.print();
    }
}