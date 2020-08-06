package javaC.Schildt.Chapter_7.method_overload;

class Overload{
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }
    void test(int a){
        System.out.println("a: " + a);
    }
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.test();
        ob.test(10);
        ob.test(10,20);
        double result;
        result = ob.test(123.25);
        System.out.println("Result : " + result);
    }
}
