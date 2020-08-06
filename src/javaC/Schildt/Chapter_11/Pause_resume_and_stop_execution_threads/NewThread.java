package javaC.Schildt.Chapter_11.Pause_resume_and_stop_execution_threads;

public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String thredname) {
        name = thredname;
        t = new Thread(this, name);
        System.out.println("New thread : " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + " " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted");
        }
        System.out.println(name + " was finished");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void muresume() {
        suspendFlag = false;
        notify();
    }
}
