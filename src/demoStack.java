class Stack{
    int []stck;
    int top;
    Stack(int size){
        stck = new int[size];
        top = -1;
    }
    void push(int item){
        int[] t;
        if(top == stck.length - 1){
            t = new int[stck.length * 2];
            for(int i = 0; i < stck.length; i++){
                t[i] = stck[i];
            }
            stck = t;
            stck[++top] = item;
            System.out.print(stck[top] + " ");
        }
        else {
            stck[++top] = item;
            System.out.print(stck[top] + " ");
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack ne zagrujen");
            return 0;
        }
        else
            return stck[top--];
    }
}

class demoStack{
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Stack stack1 = new Stack(5);

        for(int i = 0; i < 35; i++){
            stack.push(i);
        }
        System.out.println();
        for(int i = 0; i < 35; i++){
            System.out.print(stack.pop() + " ");
        }
    }
}