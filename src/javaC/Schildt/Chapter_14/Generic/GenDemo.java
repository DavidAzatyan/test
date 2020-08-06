package javaC.Schildt.Chapter_14.Generic;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println(v);



        Gen<String> sOb = new Gen<>("xnxx");
        sOb.showType();

        String str = sOb.getOb();
        System.out.println(str);

    }
}
