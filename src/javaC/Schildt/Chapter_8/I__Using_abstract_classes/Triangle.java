package javaC.Schildt.Chapter_8.I__Using_abstract_classes;

public class Triangle extends Figure {
    Triangle(int x, int y){
        super(x,y);
    }

    @Override
    void area() {
        System.out.println("Triangle area : " + (dim1 * dim2)/2);
    }
}
