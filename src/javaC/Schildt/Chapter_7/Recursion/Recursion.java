package javaC.Schildt.Chapter_7.Recursion;

class Factorial {
    int factor(int i){
        if(i == 1) return 1;
        else return i * factor(i - 1);
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factor(7));
    }
}

