package HWs.hw5;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortLevel2 {
    public static void main(String[] args) {
        /*
        Задать массив из 10 элементов случайным образом из отрезка [-66;99].
        Отсортировать элементы массива по убыванию методом простого обмена («пузырек»).
         */

        int[] array = createArray();
        bubbleSort(array);
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(array));

    }

    public static int[] createArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-66, 99);
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(array));
        System.out.println("States: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));

            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
