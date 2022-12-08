package HWs.hw8;

import java.util.ArrayDeque;
import java.util.Deque;

public class HanoiTowers {
    public static void main(String[] args) {
        int n = 5;
        Deque<Integer> i = new ArrayDeque<>();
        for (int j = n; j > 0; j--) {
            i.push(j);
        }

        Deque<Integer> t = new ArrayDeque<>();
        Deque<Integer> k = new ArrayDeque<>();


//        hanoiRecursive(n, "i", "t", "k"); // рекурсивное решение на строках

        System.out.println("Source: ");
        System.out.println(i);
        System.out.println("Destination: ");
        System.out.println(k);
        System.out.println("Method call!");
        hanoiRecursiveArray(n, i, t, k); //  рекурсивное решение на стеках
        System.out.println("Source: ");
        System.out.println(i);
        System.out.println("Destination: ");
        System.out.println(k);


    }

    public static void hanoiRecursive(int n, String i, String t, String k ){
        if (n == 1){
            System.out.println(i+k);
        } else {
            hanoiRecursive(n-1, i, k, t);
            System.out.println(i+k);
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
        System.out.println("Next step:");
        System.out.println("i:");
        System.out.println(i);
        System.out.println("t:");
        System.out.println(t);
        System.out.println("k:");
        System.out.println(k);
    }
}
