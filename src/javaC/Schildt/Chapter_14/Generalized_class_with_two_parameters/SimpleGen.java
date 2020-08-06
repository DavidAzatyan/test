package javaC.Schildt.Chapter_14.Generalized_class_with_two_parameters;

public class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> ob = new TwoGen<>(88,"Text");

        ob.ShowType();

        int v = ob.getOb1();
        System.out.println(v);

        String s = ob.getOb2();
        System.out.println(s);

    }
}
