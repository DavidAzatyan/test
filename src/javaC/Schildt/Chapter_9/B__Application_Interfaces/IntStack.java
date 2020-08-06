package javaC.Schildt.Chapter_9.B__Application_Interfaces;

interface IntStack {
    void push(int item);
    int pop();

//    default int[] popNElements(int n) {
//        return getNElements(n);
//    }
//
//    default int[] SkipAndPopNElements(int skip, int n) {
//        getNElements(skip);
//        return getNElements(n);
//    }
//
//    private int[] getNElements(int n){
//        int[] elements = new int[n];
//        for(int i = 0; i < n; i++)
//            elements[i] = pop();
//        return elements;
//    }
}
