package javaC.Schildt.Chapter_8.F__Method_Overrides;

class A1 {
    int i;
    int j;
    A1(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println(i + " " + j);
    }
}

class B1 extends A1{
    int k;
    B1(int a,int b,int c) {
        super(a,b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + " " + k);
    }
}
public class Overload {
    public static void main(String[] args) {
        B1 ob = new B1(1,2,3);
        ob.show("this is k :");
        ob.show();
    }
}
