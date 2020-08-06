package javaC.Schildt.Chapter_6;

public class Example_Box {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,4,5);
        Box mybox2 = new Box(12.5,5,12);
        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
    }
}
