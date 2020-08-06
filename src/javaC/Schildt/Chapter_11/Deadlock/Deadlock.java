package javaC.Schildt.Chapter_11.Deadlock;

public class Deadlock implements Runnable{

    A a = new A();

    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Rival thread");
        t.start();

        a.foo(b);

        System.out.println("Nazad v glavniy potok");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Nazad vdrugoy potok");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
