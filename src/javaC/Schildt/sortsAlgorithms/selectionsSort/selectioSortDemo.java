package javaC.Schildt.sortsAlgorithms.selectionsSort;
class SelectioSort{
    static void Sort(int[] arr){
        int smallerNumber;
        for(int i = 0; i < arr.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class selectioSortDemo {
    public static void main(String[] args) {
        int arr[] = {7,8,2,6,2};
        SelectioSort.Sort(arr);
    }
}
