package javaC.Schildt.Chapter_11.Execution_of_Threads;

public class Producers implements Runnable{
    Q q;
    Thread t;
    Producers(Q q){
        this.q = q;
        t = new Thread(this,"Setter");
        System.out.println(this);
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while(i < 5){
            q.put(i++);
        }
    }
}
