class Shildt {

    static int nod(int x, int y) {

        if(x == y){
            return x;
        }
        if (x > y) {
            x = x - y;
        } else {
            y = y - x;
        }
        return nod(x,y);
    }

    public static void main(String[] args) {
        int a[] = {1, 7, 5, 8, 2, 5};
        System.out.println(nod(18,30));
    }
}