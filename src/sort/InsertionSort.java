package sort;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i - 1;
            while (j >= 0 && array[j] > array[i]) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = array[i];
        }
    }
}
