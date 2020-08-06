package javaC.Schildt.Chapter_9.A__Interface;

public class TestInterface {

    public static void main(String[] args) {
        Client client = new Client();
        AnotherClient anotherClient = new AnotherClient();

        Callback c;
        c = client;

        c.s(42);

        c = anotherClient;

        c.s(42);

    }
}

abstract class AbstractClass {
    void func1() {

    }

    abstract void func2();
}
