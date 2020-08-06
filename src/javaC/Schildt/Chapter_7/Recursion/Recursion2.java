package javaC.Schildt.Chapter_7.Recursion;
class RecTest{
    int values[];
    RecTest(int i){
        values = new int[i];
    }
    void printArray(int i){
        if(i == 0){
            return;
        }
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i -1]);
    }
}
public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(5);
        for(int i = 0; i < 5; i++){
            ob.values[i] = i;
        }
        ob.printArray(5);
    }
}
