package javaC.Schildt.Chapter_9.D__Interface_Extension;

interface A {
    default void reset(){
        System.out.println("A");
    }
//    void method2();
}
