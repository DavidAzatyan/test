package javaC.Schildt.Chapter_7.Recursion;

//Дано натуральное число N. Выведите слово YES,
// если число N является точной степенью двойки,
// или слово NO в противном случае.
// Операцией возведения в степень пользоваться нельзя!
class Recur6 {
    boolean c;
        boolean b(int i) {
        if (i == 1) {
            c = true;
            return c;
        }
        else if (i % 2 != 0 || i == 0) {
            c = false;
            return c;
        } else {
            b(i / 2);
            return c;
        }
    }
}

public class Recursion6 {
    public static void main(String[] args) {
        Recur6 re = new Recur6();
        if(!re.b(2))
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}
