package javaC.Schildt.Chapter_9.B__Application_Interfaces;

public class Stack {
    public static void main(String[] args) {
        IntStack ref;
        FixedStack stack1 = new FixedStack(10);
        DynamicStack stack2 = new DynamicStack(10);

        System.out.println("FixedStack :");
        ref = stack1;
        for(int i = 0; i < 10; i++){
            ref.push(i);
        }
        System.out.println();
//        stack1.popNElements(3);
        //stack1.SkipAndPopNElements(2,1);

        for(int i = 0; i < 10; i++){
            System.out.print(ref.pop() +  " ");
        }


        System.out.println();
        System.out.println();

        System.out.println("DynamicStack :");
        ref = stack2;
        for(int i = 0; i < stack2.size + 8; i++){
            ref.push(i);
        }
        System.out.println();
        for(int i = 0; i < stack2.size + 8; i++){
            System.out.print(ref.pop() +  " ");
        }
        System.out.println();
        System.out.println("Size of array : " + stack2.arrayLength);

    }
}
