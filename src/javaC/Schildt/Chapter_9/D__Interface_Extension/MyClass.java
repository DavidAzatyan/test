package javaC.Schildt.Chapter_9.D__Interface_Extension;


public class MyClass implements A,B{


        @Override
    public void reset() {
        A.super.reset();
    }

    //    A.super.method1();
//
//    @Override
//    public void method1() {
//        System.out.println("method1");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("method2");
//    }
//
//    @Override
//    public void method3() {
//        System.out.println("method3");
//    }
}
