package javaC.Schildt.Chapter_11.Using_synchronized_methods;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "you are welcome ");
        Caller ob2 = new Caller(target, "in synchronized ");
        Caller ob3 = new Caller(target, "world");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interuptted");
        }
    }
}
