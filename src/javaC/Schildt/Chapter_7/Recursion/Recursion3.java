package javaC.Schildt.Chapter_7.Recursion;
class Reucr3{
    void s(int a){
        if(a <= 10){
            System.out.print(a + " ");
            a++;
            s(a);
        }
    }
}
public class Recursion3 {
    public static void main(String[] args) {
        Reucr3 re = new Reucr3();
        re.s(1);
    }
}
