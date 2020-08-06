package javaC.Schildt.Chapter_13.Static_import;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.arraycopy;
import static java.lang.System.out;
public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        out.println(hypot);;
    }
}
