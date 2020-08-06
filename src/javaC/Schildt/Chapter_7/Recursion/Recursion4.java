package javaC.Schildt.Chapter_7.Recursion;
//Даны два целых числа A и В (каждое в отдельной строке).
//Выведите все числа от A до B включительно,
// в порядке возрастания, если A < B,
//или в порядке убывания в противном случае.
class Recur4{
    void s(int a, int b){
            if(a < b+1){
                System.out.print(a + " ");
                a++;
                s(a, b);
            }
            if(a > b +1){
                System.out.print(a + " ");
                a--;
                s(a, b);
            }
    }
}
public class Recursion4 {
    public static void main(String[] args) {
        Recur4 re = new Recur4();
        re.s(45,30);
    }
}
