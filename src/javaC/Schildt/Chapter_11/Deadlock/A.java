package javaC.Schildt.Chapter_11.Deadlock;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " voshel v method A.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class A was interuptted");
        }

        System.out.println(name + " pitaetsya vizvat method B.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("v methode A.last()");
    }
}
