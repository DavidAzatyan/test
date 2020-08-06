package javaC.Schildt.sortsAlgorithms.bubbleSort;
class BubbleSort{
    static void Sort(int[] arr){
        int t;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
class bubbbleSortDemo {
    public static void main(String[] args) {
        int array[] = {4,89,15,2,24,2,0,58,1,25,3};
        BubbleSort.Sort(array);
    }
}
