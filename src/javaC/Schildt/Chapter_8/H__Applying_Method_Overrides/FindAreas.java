package javaC.Schildt.Chapter_8.H__Applying_Method_Overrides;

class Figure {
    int dim1;
    int dim2;


    Figure(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    void area() {
        System.out.println("Area not set : " + 0);
    }
}

class Rectangle extends Figure {

    Rectangle(int x, int y) {
        super(x, y);
    }

    void area() {
        System.out.println("Rectangle area : " + dim1 * dim2);
    }
}

class Triangle extends Figure {
    Triangle (int x, int y) {
        super(x,y);
    }

    void area() {
        System.out.println("Triangle area : "  + (dim1 * dim2) / 2);
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure figure = new Figure(0,0);
        Rectangle rectangle = new Rectangle(7,8);
        Triangle triangle = new Triangle(4,5);
        Figure refigure;

        refigure = figure;
        refigure.area();

        refigure = rectangle;
        refigure.area();

        refigure = triangle;
        refigure.area();

    }
}
