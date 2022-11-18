package HWs.hw3;

import java.util.ArrayList;

public class Level2 {
    public static void main(String[] args) {
        /*
    Найдите среднее арифметическое только чисел в массиве (не используя рекурсию)
    Разрешается использование алгоритма сортировки массива Quick Sort
    Полученные данные напечатайте в println
    САМ МАССИВ: {70, "рыба", 250, "круг" 50, 300, 1, "треугольник"}
         */

        Object[] array = {70, "рыба", 250, "круг", 50, 300, 1, "треугольник"};
        int[] ints = excludeInts(array);
        QuickSort.sort(ints);
        int median = ints.length / 2; // 70
        System.out.println(ints[median]);


    }

    public static int[] excludeInts(Object[] initial){
        ArrayList<Integer> temp = new ArrayList<>();
        for (Object o : initial){
            if (o instanceof Integer){
                temp.add((Integer) o);
            }
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }

            return result;
    }
}
