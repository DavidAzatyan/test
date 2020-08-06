package javaC.Schildt.Chapter_14.Create_a_generic_method;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i])) return true;
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};

        if(isIn(2,nums)){
            System.out.println("nums[] contain 2");
        }
        if(!isIn(7,nums)){
            System.out.println("num[] dont contain 7");
        }
    }
}