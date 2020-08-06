package javaC.Schildt.Chapter_11.Using_synchronized_methods;

public class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Was interaptted");
        }
        System.out.println("]");
    }
}
