package javaC.Schildt.Chapter_8.C__Super;


class Box1 {
    private double width;
    private double height;
    private double depth;

    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight1 extends Box1 {
    double weight;
    BoxWeight1(BoxWeight1 ob){
        super(ob);
    }

    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight1() {
        super();
        weight = -1;
    }

    BoxWeight1(double len , double m){
        super(len);
        weight = m;
    }
}

class DemoBoxWeight1 {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 mybox3 = new BoxWeight1();
        BoxWeight1 mycube = new BoxWeight1(4,2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume mybox1 is equal " + vol);
        System.out.println("Weight mybox1 is equal " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume mybox2 is equal " + vol);
        System.out.println("Weight mybox2 is equal " + mybox2.weight);
        System.out.println();
    }
}
