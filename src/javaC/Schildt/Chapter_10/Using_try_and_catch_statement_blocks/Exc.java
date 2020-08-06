package javaC.Schildt.Chapter_10.Using_try_and_catch_statement_blocks;

import java.util.Random;

public class Exc {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Random random = new Random();

        for(int i = 0; i < 10; i ++){
            try{
                b = random.nextInt();
                c = random.nextInt();
                a = 12345/(b/c);
            }catch(ArithmeticException e){
                System.out.println("DEl na 0");
                a = 0;
            }
            System.out.println(a);
        }
    }
}
