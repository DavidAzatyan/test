package javaC.Schildt.Chapter_9.B__Application_Interfaces;

public class DynamicStack implements IntStack {
    private int[] stack;
    private int top;
    int size;
    int arrayLength;
    DynamicStack(int size) {
        stack = new int[size];
        this.size = size;
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == stack.length - 1) {
            int[] temp;
            temp = new int[stack.length + 1];
            arrayLength = temp.length;
            for(int i = 0; i < stack.length; i++){
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++top] = item;
            System.out.print(stack[top] + " ");

        } else {
            stack[++top] = item;
            System.out.print(stack[top] + " ");
        }
    }

    @Override
    public int pop() {
        if(top < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return stack[top--];
        }
    }
}
