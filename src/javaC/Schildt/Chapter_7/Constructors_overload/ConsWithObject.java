package javaC.Schildt.Chapter_7.Constructors_overload;



class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test ob) {
        if(ob.a == a && ob.b == b) {
            return true;
        }
        else return false;
    }
}

class ConsWithObject{
    public static void main(String[] args) {
        Test o = new Test(100,22);
        Test o1 = new Test(100,22);
        Test o2 = new Test(-1,-1);

        System.out.println(o.equalTo(o1));
        System.out.println(o.equalTo(o2));
    }
}

