package javaC.Schildt.Chapter_10.Finally_statement;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("in procA()");
            throw new RuntimeException("demo");
        }catch (RuntimeException e){
            System.out.println("im asacov kanes");
//            throw e;
        }
        finally {
            System.out.println("Finally operator in procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("in procB()");
            return;
        } finally {
            System.out.println("Finally operator in procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("in procC()");
        } finally {
            System.out.println("Finally operator in procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception is catched");
        }
        procB();
        procC();
    }
}
