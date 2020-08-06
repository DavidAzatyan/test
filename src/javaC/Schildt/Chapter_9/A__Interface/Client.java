package javaC.Schildt.Chapter_9.A__Interface;

public class Client implements Callback {
    public void s(int a){
        System.out.println(a);
    }

    void s(double a){
        System.out.println();
    }

    void nonIfaceMeth(){
        System.out.println("Davs");
    }
}
