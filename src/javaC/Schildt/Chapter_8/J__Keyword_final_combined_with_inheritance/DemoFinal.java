package javaC.Schildt.Chapter_8.J__Keyword_final_combined_with_inheritance;
class A {
    final void meth() {
        System.out.println("meth from A ");
    }
}

class B extends A {
    //void meth() { }; ОШИБКА! Этот метод не может быть переопределен.
}

public class DemoFinal {
    public static void main(String[] args) {

    }
}
