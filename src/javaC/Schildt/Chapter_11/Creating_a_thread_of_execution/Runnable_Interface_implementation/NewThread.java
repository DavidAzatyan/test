package javaC.Schildt.Chapter_11.Creating_a_thread_of_execution.Runnable_Interface_implementation;

class NewThread implements Runnable {
    Thread t;
    NewThread(){
        t = new Thread(this,"demo thread");
        System.out.println("Child thread " + t);
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child thread : " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child thread is interrupted");
        }
        System.out.println("Child thread is finished");
    }
}
