package javaC.Schildt.Chapter_10.Using_try_and_catch_statement_blocks;

public class MultipleCatches {
    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a :" + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;

        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
