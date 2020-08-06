package javaC.Schildt.Chapter_7.Constructors_overload;


class Box1 {
    double width;
    double height;
    double depth;

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box1(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box1(double len){
        width = height = depth = len;
    }
    double volume() {
        return depth * width * height;
    }
}

public class OverloadCons1 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10, 20, 30);
        Box1 mybox2 = new Box1();
        Box1 mybox3 = new Box1(7);

        Box1 cloneBox = new Box1(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);

        vol = mybox3.volume();
        System.out.println(vol);

        vol = cloneBox.volume();
        System.out.println(vol);
    }
}