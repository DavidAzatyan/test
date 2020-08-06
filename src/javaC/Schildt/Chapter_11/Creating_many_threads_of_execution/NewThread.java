package javaC.Schildt.Chapter_11.Creating_many_threads_of_execution;

public class NewThread implements Runnable {
    Thread t;
    String name;
    NewThread(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println("Child thread : " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + i);
                t.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Chld thread was interrapted");
        }
        System.out.println(name  + " was finished");
    }
}
