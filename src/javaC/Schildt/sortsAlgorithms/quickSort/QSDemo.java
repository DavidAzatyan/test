package javaC.Schildt.sortsAlgorithms.quickSort;

public class QSDemo {

    public static void main(String args[]) {
        char a[] = {'d', 'х', 'а', 'r', 'р', 'j', 'i'};
        int i;
        System.out.print("Иcxoдный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();

        // Отсортировать массив
        quickSort.qsort(a);

        System.out.print("Oтcopтиpoвaнный массив: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }
}