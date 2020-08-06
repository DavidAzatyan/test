package javaC.Schildt.Chapter_11.Creating_a_thread_of_execution.Thread_class_extension;

public class ExtendThread {
    public static void main(String[] args) {
        NewThread t = new NewThread();

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main thread : " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread was interapted");
        }
        System.out.println("Main thread was finished");
    }
}
