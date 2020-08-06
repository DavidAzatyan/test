package javaC.Schildt.Chapter_8.F__Method_Overrides;

class A {
    int i;
    int j;
    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println(i + " " + j);
    }
}

class B extends A{
    int k;
    B(int a,int b,int c) {
        super(a,b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println(k);
    }
}

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show();
    }
}
