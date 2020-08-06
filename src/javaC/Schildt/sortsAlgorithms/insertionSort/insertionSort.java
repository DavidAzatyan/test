package javaC.Schildt.sortsAlgorithms.insertionSort;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {7, 1, 2, 5, 8, 1};

        int key, j;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
