package javaC.Schildt.Chapter_8.I__Using_abstract_classes;

abstract class Figure {
    int dim1;
    int dim2;
    int a = 1;
    Figure(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void area();
}
