package javaC.Schildt.Chapter_11.Execution_of_Threads;

public class Consummer implements Runnable {
    Q q;
    Thread t;

    Consummer(Q q) {
        this.q = q;
        t = new Thread(this, "Getter");
        System.out.println(this);
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            q.get();
            i++;
        }
    }
}
