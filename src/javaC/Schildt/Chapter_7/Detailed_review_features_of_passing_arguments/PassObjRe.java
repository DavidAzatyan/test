package javaC.Schildt.Chapter_7.Detailed_review_features_of_passing_arguments;
class Test1{
    int a, b;
    Test1(int i, int j) {
        a = i;
        b = j;
    }
    // передать объект
    void meth(Test1 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
public class PassObjRe {
    public static void main(String args[]) {
        Test1 ob = new Test1(15, 20);
        System.out.println("ob.a и оЬ.Ь до вызова: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a и оЬ.Ь после вызова: " + ob.a + " " + ob.b);
    }
}
