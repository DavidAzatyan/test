package javaC.Schildt.Chapter_11.Deadlock;

public class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " voshel v method B.bar()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class B was interuptted");
        }

        System.out.println(name + " pitaetsya vizvat method A.last()");
        a.last();
    }

    synchronized void last(){
        System.out.println("v methode B.last()");
    }
}
