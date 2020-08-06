package javaC.Schildt.queue;
class Queue{
    private int[] que;
    private int putlock, getlock;
    Queue(int size){
        que = new int[size];
        putlock = -1;
        getlock = -1;
    }

    void push(int item){
        if(putlock == que.length - 1){
            System.out.println("Ochered zapolnena");
        }
        else
            que[++putlock] = item;
    }

    int pop(){
        if(getlock == putlock){
            System.out.println("Ochered pusta");
            return 0;
        }
        else {return que[++getlock];}
    }
}
public class demoQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(60);
        Queue queue1 = new Queue(10);

        for(int i = 0; i < 60; i++){
            queue.push(i);
        }

        for(int i = 0; i < 10; i++){
            queue1.push(i);
        }

        for(int i = 0; i < 60; i++){
            System.out.print(queue.pop() + " ");
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.print(queue1.pop() + " ");
        }

    }
}
