class multi extends Thread 
{
    public void run() {
        System.out.println("Threads 1 is running...");
    }
}

class multi2 extends Thread {
    public void run() {
        System.out.println("Threads 2 is running...");
    }
}

class multi3 extends Thread {
    public void run() {
        System.out.println("Threads 3 is running...");
    }
}
public class Threads{
    public static void main(String[] args) {
        multi t1 = new multi();
        multi2 t2 = new multi2();
        multi3 t3=new multi3();
        t1.start();
        t2.start();
        t3.start();
    }
}