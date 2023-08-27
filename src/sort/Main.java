package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 8, 3, 4, 2, 7, 3, 0, 7, 2, 4, 5, 4};
        int[] array1 = Arrays.copyOf(array, array.length);
        int[] array2 = Arrays.copyOf(array, array.length);
        int[] array3 = Arrays.copyOf(array, array.length);
        int[] array4 = Arrays.copyOf(array, array.length);
        int[] array5 = Arrays.copyOf(array, array.length);
        System.out.println("Before sorting:  " + Arrays.toString(array));

        //Test Bubble Sort
        Sort sort = new BubbleSort();
        sort.sort(array1);
        System.out.println("Bubble Sort:     " + Arrays.toString(array1));

        //Test Insertion Sort
        sort = new InsertionSort();
        sort.sort(array2);
        System.out.println("Insertion Sort:  " + Arrays.toString(array2));

        //Test Selection Sort
        sort = new SelectionSort();
        sort.sort(array3);
        System.out.println("Selection Sort:  " + Arrays.toString(array3));

        //Test Quick Sort
        sort = new QuickSort();
        sort.sort(array4);
        System.out.println("Quick Sort:      " + Arrays.toString(array4));

        //Test Merge Sort
        sort = new MergeSort();
        sort.sort(array5);
        System.out.println("Merger Sort:     " + Arrays.toString(array5));
    }
}
