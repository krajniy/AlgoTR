package HWs.hw3;

public class QuickSort {
    public static void sort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int from, int to) {
        if (from < to) {
            int pivot = partition(array, from, to);
            sort(array, from, pivot);
            sort(array, pivot + 1, to);
        }
    }

    private static int partition(int[] array, int from, int to) {

        int pivotIndex = (from + to) / 2;
        int pivotEl = array[pivotIndex];
        int i = from;
        int j = to;
        do {
            while (array[i] < pivotEl) {
                i++;
            }
            while (array[j] > pivotEl) {
                j--;
            }
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        } while (i < j);

        return j;
    }

}
