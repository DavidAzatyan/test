package javaC.Schildt.Chapter_12.Enums_in_Java_are_Class_Types;

public enum Apple {
    Jonathan(10), GoldenDel(8), RedDel(12), Winesap(5), Cortland();

    private int price ;

    Apple(int p){
        price = p;
    }

    Apple(){
    }

    int getPrice(){
        return price;
    }
}
