package javaC.Schildt.Chapter_11.isAlive_join;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Thread1");
//        new NewThread2("Thread2");
        NewThread ob3 = new NewThread("Thread3");

//        System.out.println(ob1.t.isAlive());
//        System.out.println(ob2.t.isAlive());
//        System.out.println(ob3.t.isAlive());


        try{
            ob1.t.join();
            ob3.t.join();
            for(int i = 5; i > 0; i--){
                System.out.println("Main thread " + i);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread was interrapted");
        }
        System.out.println("Main thread was finished");
    }
}
