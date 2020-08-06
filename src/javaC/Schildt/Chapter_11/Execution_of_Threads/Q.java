package javaC.Schildt.Chapter_11.Execution_of_Threads;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println();
            }
        this.n = n;
        valueSet = true;

        System.out.println("Otpravleno : " + n);
        notify();
    }

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println();
            }
        System.out.println("Polucheno : " + n);
        valueSet = false;

        notify();
        return n;
    }
}
