package javaC.Schildt.Chapter_11.Main_thread_of_execution;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t);

        t.setName("myThread");

        System.out.println(t);

        try {
            for(int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread is interaptted");
        }
    }
}
