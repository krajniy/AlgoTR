package HWs.hw3;

public class Level1 {
    /*
    Найдите самое большое и самое маленькое число в заданном массиве
    не используя рекурсию в функции getMaxMinElement()
    Разрешается использование алгоритма сортировки массива Quick Sort.
    Полученные данные напечатайте в println
    САМ МАССИВ: {70, 250, 50, 300, 1}
     */
    public static void main(String[] args) {
        int[] array = {70, 250, 50, 300, 1};
        QuickSort.sort(array);
        System.out.println("Min element: " + array[0]);
        System.out.println("Max element: " + array[array.length-1]);


    }
}
