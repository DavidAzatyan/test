package javaC.Schildt.Chapter_7.Variable_length_arguments;

public class PassArray {
    static void vaTest(int v[]){
        System.out.println("Count of arguments : " + v.length);
        for(int x : v){
            System.out.println(x);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] n1 = {10,2};
        int[] n2 = {1,2,3};
        vaTest(n1);
        vaTest(n2);
    }
}
