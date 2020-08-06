package javaC.Schildt.Chapter_11.Creating_a_thread_of_execution.Runnable_Interface_implementation;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main potok : " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main potok prervan");
        }
        System.out.println("Main potok zavershen");
    }
}
