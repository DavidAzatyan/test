package javaC.Schildt.Chapter_8.A__The_Basics_of_Inheritance;

class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;
    BoxWeight(){}

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class BoxColor extends BoxWeight {
    String color;

    BoxColor(double w, double h, double d, double m ,String c) {
        width = w;
        height = h;
        depth = d;
        weight = m;
        color = c;
    }

}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxColor mybox3 = new BoxColor(4,4,5,77,"Black");

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume mybox1 is equal " + vol);
        System.out.println("Weight mybox1 is equal " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume mybox2 is equal " + vol);
        System.out.println("Weight mybox2 is equal " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume mybox3 is equal " + vol);
        System.out.println("Weight mybox2 is equal " + mybox3.weight);
        System.out.println("Color mybox3 is " + mybox3.color);



        BoxWeight weightBox = new BoxWeight(3,5,7,9);
        Box plainBox = new Box();
        vol = weightBox.volume();
        System.out.println(vol);

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println(vol);

    }
}
