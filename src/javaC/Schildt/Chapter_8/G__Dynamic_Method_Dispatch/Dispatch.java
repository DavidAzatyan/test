package javaC.Schildt.Chapter_8.G__Dynamic_Method_Dispatch;

class A {
    void callme() {
        System.out.println("in A");
    }
}

class B extends A {
    void callme() {
        System.out.println("in B");
    }
}

class C extends B {
    void callme() {
        System.out.println("in C");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        c.callme();
    }
}
