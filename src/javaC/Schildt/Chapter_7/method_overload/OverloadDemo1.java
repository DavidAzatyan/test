package javaC.Schildt.Chapter_7.method_overload;

class Overload1{
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}
public class OverloadDemo1 {
    public static void main(String[] args) {
        Overload1 ob = new Overload1();
        double i = 88;

        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);
    }
}
