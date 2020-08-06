package javaC.Schildt.Chapter_11.Creating_a_thread_of_execution.Thread_class_extension;

public class NewThread extends Thread{
    NewThread(){
        super("Demo Thread");
        System.out.println("Child thread : " + this);
        start();
    }

    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child thread : " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child thread was interapted");
        }
        System.out.println("Child thread was finished");
    }
}
