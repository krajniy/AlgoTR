package HWs.hw8;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {
    public static void main(String[] args) {
        int n = 5;
        Deque<Integer> i = new ArrayDeque<>();
        for (int j = n; j > 0; j--) {
            i.push(j);
        }
        Deque<Integer> t = new ArrayDeque<>();
        Deque<Integer> k = new ArrayDeque<>();

        HanoiTowers.hanoiRecursive(n, "i", "t", "k");
        HanoiTowersIterative.hanoiIterative(n, i, t, k);

        System.out.println(HanoiTowers.recursiveSB.toString().equals(HanoiTowersIterative.iterativeSB.toString()));

    }
}
