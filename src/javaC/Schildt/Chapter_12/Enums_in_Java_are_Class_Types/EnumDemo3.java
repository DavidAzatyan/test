package javaC.Schildt.Chapter_12.Enums_in_Java_are_Class_Types;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Яблoкo сорта Winesap стоит " + Apple.Winesap.getPrice() + " центов. \n");
        System.out.println("Цeны на все сорта яблок:");
        for(Apple a : Apple.values()){
            System.out.println(a + " стоит " + a.getPrice() + " центов. ");
        }
    }
}
