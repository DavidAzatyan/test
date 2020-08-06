package Merge;

public class Merge {
    public static void main(String[] args) {

        int a[] = {1, 2, 4, 7, 19};

        int b[] = {0, 1, 3, 8, 10, 11, 21, 31, 41};

        int w[] = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                w[k++] = a[i];
                i++;
            } else {
                w[k++] = b[j];
                j++;
            }
        }
        while (i < a.length) {
            w[k++] = a[i++];
        }
        while (j < b.length) {
            w[k++] = b[j++];
        }
        for (int x = 0; k < w.length; x++) {
            System.out.println(w[k]);
        }
    }
}
