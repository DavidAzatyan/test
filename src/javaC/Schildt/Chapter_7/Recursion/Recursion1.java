package javaC.Schildt.Chapter_7.Recursion;

class Reverse{

    int j = 10000;
    int reverse(int i){
        if(j == 10){
            return i;
        }
        else{
            j = j/10;
            return i%10 * j + (reverse(i/10) * j/10);
        }
    }

    void reverse1(int i){
        if(i/10 == 0){
            System.out.print(i);
        }
        else{

            System.out.print(i%10);
            reverse1(i/10);
        }
    }
}
public class Recursion1 {
    public static void main(String[] args) {
        Reverse re =  new Reverse();
        System.out.println(re.reverse(1021));
        re.reverse1(133546);
    }
}
