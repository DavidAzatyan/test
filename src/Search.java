import java.util.ArrayList;
import java.util.Scanner;



public class Search {
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        n = n%10 + sum(n/10);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}