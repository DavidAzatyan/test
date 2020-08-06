package javaC.Schildt.Chapter_7.Detailed_review_features_of_passing_arguments;
class Test{
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
public class CallByValue {
    public static void main(String args[]) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a и Ь до вызова: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a и Ь после вызова: " + a + " " + b);
    }
}