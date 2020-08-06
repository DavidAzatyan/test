package javaC.Schildt.Chapter_11.Creating_many_threads_of_execution;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Thread1");
        new NewThread("Thread2");
        new NewThread("Thread3");

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main thread :" + i);
                Thread.sleep(5000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread was interrapted ");
        }
        System.out.println("Mian thread was finished");
    }
}
