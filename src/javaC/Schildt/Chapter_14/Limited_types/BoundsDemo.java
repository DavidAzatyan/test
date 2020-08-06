package javaC.Schildt.Chapter_14.Limited_types;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1,2,3,4,5};
        Stats<Integer> ob = new Stats<>(inums);
        double v = ob.average();
        System.out.println(v);

        Double[] inums2 = {1.0,2.0,3.0,4.0,6.0};
        Stats<Double> ob2 = new Stats<>(inums2);
        double v2 = ob2.average();
        System.out.println(v2);

    }
}
