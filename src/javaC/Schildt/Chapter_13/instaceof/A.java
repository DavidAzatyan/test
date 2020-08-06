package javaC.Schildt.Chapter_13.instaceof;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class insatceof {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        A s = new C();

        if (a instanceof A) {
            System.out.println("a in A");
        }
        if (b instanceof B) {
            System.out.println("b in b");
        }
        if(c instanceof C){
            System.out.println("c in C");
        }
        if(c instanceof A){
            System.out.println("c in A");
        }
        if(a instanceof C){
            System.out.println("a in C");
        }
        if(d instanceof A){
            System.out.println("d in A");
        }
        if(s instanceof A){
            System.out.println("s in A");
        }
        if(s instanceof C){
            System.out.println("s in C");
        }
    }
}