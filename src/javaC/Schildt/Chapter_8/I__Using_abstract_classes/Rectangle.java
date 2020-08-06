package javaC.Schildt.Chapter_8.I__Using_abstract_classes;

public class Rectangle extends Figure{
    Rectangle(int x, int y) {
        super(x,y);
    }

    void area() {
        System.out.println("Rectangle area : " + dim1 * dim2);
    }
}
