package javaC.Schildt.Chapter_11.Execution_of_Threads;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producers(q);
        new Consummer(q);
//        ob2.t.setPriority(6);

    }
}
