package javaC.Schildt.Chapter_9.D__Interface_Extension;

interface B {

//    void method3();
//    private int method(){
//        return 0;
//    }
//
//    default int ret() {
//        return method();
//    }

    default void reset() {
        System.out.println("B");
    }




//    private int d() {
//        return method();
//    }

}
