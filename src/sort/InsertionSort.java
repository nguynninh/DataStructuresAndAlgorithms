package sort;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] array) {
        int key, j;
        for (int i = 0; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
    }
}
