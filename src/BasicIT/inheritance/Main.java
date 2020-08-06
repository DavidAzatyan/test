package BasicIT.inheritance;

class Person {
    String firstName;
    String lastName;
    int age;

    void speak() {
        System.out.println("speaking...");
    }
}

class Worker extends Person {
    double salary;

    void work() {
        System.out.println("working...");
    }
}

class Pensioner extends Person {
    double pension;
    int countOfGrandson;

    void play() {
        System.out.println("playing...");
    }
}

class Veteran extends Pensioner {
    int countOfMedals;

    void playNardi() {
        System.out.println("Playing nardi ...");
    }
}

class Comunist extends Pensioner {
    int countOfGorctal;

    void gorcTal() {
        System.out.println("Gorc tal...");
    }
}

class Cardiolog extends Worker {
    int staj;

    void bujel() {
        System.out.println("Bujel");
    }
}

class Srtaban extends Cardiolog {

}

class Programmer extends Srtaban {

    Programmer() {

    }

    void codeGrel() {
        System.out.println("Codding...");
    }
}

public class Main {
    public static void main(String[] args) {
        Srtaban srtaban = new Srtaban();
        srtaban.bujel();
    }
}
