package javaC.Schildt.stack;
class Stack{
    private int[] stck;
    private int top;

    Stack(int size){
        stck = new int[size];
        top = -1;
    }

    void push(int item){
        if(top == stck.length - 1){
            System.out.println("Stack is full");
        }
        else{
            stck[++top] = item;
            System.out.print(stck[top] + " ");
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return stck[top--];
        }
    }
}
public class demoStack {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Stack stack1 = new Stack(10);

        for(int i = 0; i < 5; i++){
            stack.push(i);
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            System.out.print(stack.pop() + " ");
        }
    }
}
