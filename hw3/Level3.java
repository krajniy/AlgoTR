package HWs.hw3;

public class Level3 {
    /*
    Расставьте в алфавитном порядке буквы.
    Разрешается использование алгоритма сортировки массива Quick Sort.
    Полученные данные напечатайте в println
    На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
     */


    public static void main(String[] args) {
        String string = "poiuytrewqlkjhgfdsamnbvcxz";
        String result = sortedLetters(string);
        System.out.println(result);

    }

    public static String sortedLetters(String string) {
        StringBuilder result = new StringBuilder();
        char[] letters = string.toCharArray();
        int[] toSort = new int[letters.length];
        for (int i = 0; i < letters.length; i++) {
            toSort[i] = letters[i];
        }

        QuickSort.sort(toSort);

        for (int j : toSort) {
            result.append((char) j);
        }
        return result.toString();
    }
}
