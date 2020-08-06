package javaC.Schildt.Chapter_7.Constructors_overload;

class Box{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
public class OverloadCons {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box(10,20,15);
        Box cube = new Box(7);

        Box myClone = new Box();

        System.out.println("Volume of myBox is equal: " + myBox.volume());
        System.out.println("Volume of myBox1 is equal: " + myBox1.volume());
        System.out.println("Volume of cube is equal: " + cube.volume());
    }
}

