package javaC.Schildt.Chapter_10.Creating_custom_exception_subclasses;

public class MyException extends Exception {
    private int detail;
    MyException(int a){
        detail = a;
    }

    public String toString(){
        return "MyException[" + detail + "]";
    }
}
