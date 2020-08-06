package javaC.Schildt.Chapter_14.Using_metacharacter_arguments;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        Double[] arr1 = {1.0,2.0,3.0};
        Stats2<Integer> iOb = new Stats2<>(arr);
        Stats2<Double> dOb  = new Stats2<>(arr1);

//        double v = iOb.average();
//        double v1 = dOb.average();
//        System.out.println(v);
//        System.out.println(v1);

        if(iOb.sameAvg(iOb)){
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
