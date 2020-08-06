package javaC.Schildt.Chapter_6;

public class Box{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = d;
        depth = h;
    }

    double volume(){
        return width * height * depth;
    }
}
