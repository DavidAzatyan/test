package javaC.Schildt.Chapter_11.isAlive_join;

class NewThread2 implements Runnable{
    String name;
    Thread t;

    NewThread2(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println(t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " " + i);
                t.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name + " was interrupted");
        }
        System.out.println(name + " was finished");

    }
}
