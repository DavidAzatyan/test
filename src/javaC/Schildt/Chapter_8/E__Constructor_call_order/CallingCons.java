package javaC.Schildt.Chapter_8.E__Constructor_call_order;
class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}

class C extends B {
    C() {
        System.out.println("C");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        A a = new A();
        System.out.println();
        B b = new B();
        System.out.println();
        C c = new C();

    }
}
