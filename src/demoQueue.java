class Queue{
    char q[];
    int putloc, getloc;

    Queue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    void put(char ch){
        if(putloc == q.length - 1){
            System.out.println(" - Ochered zapolnena");
        }
        putloc++;
        q[putloc] = ch;
    }
    char get(){
        if(getloc == putloc){
            System.out.println("- Ochered pusta");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

public class demoQueue {
    public static void main(String[] args) {
        Queue q1 = new Queue(100);
        Queue q2 = new Queue(10);

        for(int i = 0; i < 26 ; i++) {
            q1.put((char)('A' + i));
        }
        for(int i = 0; i < 26 ; i++){
            System.out.print(q1.get() + " ");
        }

        System.out.println();

        for(int i = 0 ; i < 4; i++){
            q2.put((char)('A' + i));
        }
        for(int i = 0; i < 4 ; i++){
            System.out.print(q2.get() + " ");
        }
    }
}
