package javaC.Schildt.Chapter_8.I__Using_abstract_classes;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,8);
        Triangle tiangle = new Triangle(7,9);


        Figure refigure;

        refigure = rectangle;
        refigure.area();

        refigure = tiangle;
        refigure.area();
    }
}
