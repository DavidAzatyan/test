package javaC.Schildt.Chapter_11.Using_synchronized_methods;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String m) {
        target = targ;
        msg = m;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
