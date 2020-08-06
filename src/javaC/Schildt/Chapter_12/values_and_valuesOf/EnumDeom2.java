package javaC.Schildt.Chapter_12.values_and_valuesOf;

public class EnumDeom2 {
    public static void main(String[] args) {

        Apple ар;

        System.out.println("Константы перечислимого типа Apple:");

        Apple allapples[] = Apple.values();

        for (Apple a : allapples)
            System.out.println(a);
        System.out.println();

        Apple ap1 = Apple.valueOf("Winesap");
        System.out.println(ap1);

    }
}
