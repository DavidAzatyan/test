package javaC.Schildt.Chapter_14.How_generalizations_increase_type_safety;

public class NonGenDemo {
    public static void main(String ... args){
        NonGen iob = new NonGen(88);

        int v = (Integer) iob.getOb();
        System.out.println(v);
        iob.showtype();

        NonGen strob = new NonGen("srting");
        String s = (String) strob.getOb();
        System.out.println(s);
        strob.showtype();

    }
}
