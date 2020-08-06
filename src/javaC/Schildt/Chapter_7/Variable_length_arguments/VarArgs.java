package javaC.Schildt.Chapter_7.Variable_length_arguments;

public class VarArgs {
    static void vaTest(int ... v) {
        System.out.println("Length: " + v.length);
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 5, 1, 25, 36, 1);
        vaTest();
    }
}
