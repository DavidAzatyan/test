package javaC.Schildt.Chapter_10.Throw_operator;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("Demo");
        }catch(NullPointerException e){
            System.out.println("Isklyuchenie perexvachno v demoproc()");
//            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.println("Povtorniy perexvat : " + e);
        }
    }
}
