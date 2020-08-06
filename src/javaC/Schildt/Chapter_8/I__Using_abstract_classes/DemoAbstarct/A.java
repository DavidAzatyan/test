package javaC.Schildt.Chapter_8.I__Using_abstract_classes.DemoAbstarct;

abstract class A {
    abstract void a();
}
abstract class B extends A{
    abstract void b();
}
class C extends B{
    @Override
    void b() {

    }

    @Override
    void a() {

    }
}