package HWs.hw8;

import java.util.ArrayDeque;
import java.util.Deque;

public class HanoiTowers {
        static StringBuilder recursiveSB = new StringBuilder();
    public static void main(String[] args) {
        int n = 5;
        Deque<Integer> i = new ArrayDeque<>();
        for (int j = n; j > 0; j--) {
            i.push(j);
        }

        Deque<Integer> t = new ArrayDeque<>();
        Deque<Integer> k = new ArrayDeque<>();


        hanoiRecursive(n, "i", "t", "k"); // рекурсивное решение на строках
        System.out.println(recursiveSB);
        System.out.println(recursiveSB.length());


//        hanoiRecursiveArray(n, i, t, k); //  рекурсивное решение на стеках


    }

    public static void hanoiRecursive(int n, String i, String t, String k ){
        if (n == 1){
            recursiveSB.append(i).append("->").append(k).append("\n");

        } else {
            hanoiRecursive(n-1, i, k, t);
            recursiveSB.append(i).append("->").append(k).append("\n");
            hanoiRecursive(n-1, t, i, k);
        }
    }

    public static void hanoiRecursiveArray(int n, Deque<Integer> i,Deque<Integer> t,Deque<Integer> k){
        if (n == 1){
            k.push(i.pop());

            // печатаем последовательность
            printDeques(i, t, k);

        } else {
            hanoiRecursiveArray(n-1, i, k, t);
            k.push(i.pop());

            // печатаем последовательность
            printDeques(i, t, k);
            hanoiRecursiveArray(n-1, t, i, k);

        }
    }











    public static void printDeques(Deque<Integer> i, Deque<Integer> t, Deque<Integer> k) {
        System.out.println("Step:");
        System.out.println("i:");
        System.out.println(i);
        System.out.println("t:");
        System.out.println(t);
        System.out.println("k:");
        System.out.println(k);
    }
}
