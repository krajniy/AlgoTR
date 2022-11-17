package HWs.hw5;

import java.util.Arrays;

public class BubbleSortLevel1 {
    public static void main(String[] args) {
        /*
        Методом простого обмена  («пузырек») отсортируйте массив используя не вложенные циклы for, a конструкцию while.
         */

        int[] array = {3,60,35,2,45,320,5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int i = 0;
        while (i < array.length){
        int j = array.length - 1;
            while (j > i){
                if (array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
                j--;
            }
            i++;
        }
    }
}


