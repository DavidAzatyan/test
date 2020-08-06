package javaC.Schildt.Chapter_7.Recursion;
//Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки,
// списки, массивы (ну и циклы, разумеется).
class Sum{
    int sum(int i){
        if(i == 0){
            return 0;
        }
        else{
            return i%10 + sum(i/10);
        }
    }
}
public class Recursion5 {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(123));
    }
}
