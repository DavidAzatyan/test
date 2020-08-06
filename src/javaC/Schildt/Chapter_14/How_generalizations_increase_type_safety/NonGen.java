package javaC.Schildt.Chapter_14.How_generalizations_increase_type_safety;

public class NonGen {
    Object ob;

    NonGen(Object ob){
        this.ob = ob;
    }

    Object getOb(){
        return ob;
    }
    void showtype(){
        System.out.println(ob.getClass().getName());
    }
}
