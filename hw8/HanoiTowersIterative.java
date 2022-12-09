package HWs.hw8;

import java.util.ArrayDeque;
import java.util.Deque;

public class HanoiTowersIterative {
    static StringBuilder iterativeSB = new StringBuilder();
    public static void main(String[] args) {
        int n = 5;
        Deque<Integer> i = new ArrayDeque<>();
        for (int j = n; j > 0; j--) {
            i.push(j);
        }
        Deque<Integer> t = new ArrayDeque<>();
        Deque<Integer> k = new ArrayDeque<>();

        HanoiTowers.printDeques(i, t, k); // before
        hanoiIterative(n, i, t, k);
        HanoiTowers.printDeques(i, t, k); // after

        System.out.println(iterativeSB);
        System.out.println(iterativeSB.length());





    }


    public static void hanoiIterative(int n, Deque<Integer> i, Deque<Integer> t, Deque<Integer> k) {

        if (n == 1) {
            k.push(i.pop());
            iterativeSB.append("i->k").append("\n");
            return;
        }

        Deque<Integer> smallestDiskCurrentPlace = null; //текущее положение наименьшего диска
        Deque<Integer> smallestDiskPreviousPlace = null; //прошлое положение наименьшего диска
        boolean smallestWasMoved = false; //двигали наименьший диск?

        //первый ход для четного/нечетного количества дисков
        if (n % 2 == 0) {
            smallestDiskCurrentPlace = t;
            t.push(i.pop());
            iterativeSB.append("i->t").append("\n");

        } else {
            smallestDiskCurrentPlace = k;
            k.push(i.pop());
            iterativeSB.append("i->k").append("\n");

        }

        smallestWasMoved = true;
        smallestDiskPreviousPlace = i;

        while (true) {
            if (smallestWasMoved) { // если наименьший двигали, делаем допустимый шаг
                // ищем допустимый шаг для состояния дисков
                if (smallestDiskCurrentPlace == i) {
                    if (t.peek() == null && k.peek() == null) { // все диски на i
                        break;
                    } else if (t.peek() == null && k.peek() != null) {
                        t.push(k.pop());
                        iterativeSB.append("k->t").append("\n");


                    } else if (t.peek() != null && k.peek() == null) {
                        k.push(t.pop());
                        iterativeSB.append("t->k").append("\n");

                    } else if (t.peek() > k.peek()) {
                        t.push(k.pop());
                        iterativeSB.append("k->t").append("\n");

                    } else {
                        k.push(t.pop());
                        iterativeSB.append("t->k").append("\n");


                    }
                } else if (smallestDiskCurrentPlace == t) {
                    if (i.peek() == null && k.peek() == null) { // все диски на t
                        break;
                    } else if (i.peek() == null && k.peek() != null) {
                        i.push(k.pop());
                        iterativeSB.append("k->i").append("\n");


                    } else if (i.peek() != null && k.peek() == null) {
                        k.push(i.pop());
                        iterativeSB.append("i->k").append("\n");

                    } else if (i.peek() > k.peek()) {
                        i.push(k.pop());
                        iterativeSB.append("k->i").append("\n");

                    } else {
                        k.push(i.pop());
                        iterativeSB.append("i->k").append("\n");

                    }

                } else {
                    if (i.peek() == null && t.peek() == null) { // все диски на k
                        break;
                    } else if (i.peek() == null && t.peek() != null) {
                        i.push(t.pop());
                        iterativeSB.append("t->i").append("\n");


                    } else if (i.peek() != null && t.peek() == null) {
                        t.push(i.pop());
                        iterativeSB.append("i->t").append("\n");

                    } else if (i.peek() > t.peek()) {
                        i.push(t.pop());
                        iterativeSB.append("t->i").append("\n");

                    } else {
                        t.push(i.pop());
                        iterativeSB.append("i->t").append("\n");

                    }
                }
                smallestWasMoved = false;

            } else {
                if (smallestDiskCurrentPlace == i && smallestDiskPreviousPlace == t){
                    k.push(i.pop());
                    smallestDiskPreviousPlace = i;
                    smallestDiskCurrentPlace = k;
                    iterativeSB.append("i->k").append("\n");

                } else if (smallestDiskCurrentPlace == i && smallestDiskPreviousPlace == k) {
                    t.push(i.pop());
                    smallestDiskPreviousPlace = i;
                    smallestDiskCurrentPlace = t;
                    iterativeSB.append("i->t").append("\n");

                } else if (smallestDiskCurrentPlace == t && smallestDiskPreviousPlace == i){
                    k.push(t.pop());
                    smallestDiskPreviousPlace = t;
                    smallestDiskCurrentPlace = k;
                    iterativeSB.append("t->k").append("\n");

                } else if (smallestDiskCurrentPlace == t && smallestDiskPreviousPlace == k) {
                    i.push(t.pop());
                    smallestDiskCurrentPlace = i;
                    smallestDiskPreviousPlace = t;
                    iterativeSB.append("t->i").append("\n");

                } else if (smallestDiskCurrentPlace == k && smallestDiskPreviousPlace == i) {
                    t.push(k.pop());
                    smallestDiskCurrentPlace = t;
                    smallestDiskPreviousPlace = k;
                    iterativeSB.append("k->t").append("\n");

                } else if (smallestDiskCurrentPlace == k && smallestDiskPreviousPlace == t) {
                    i.push(k.pop());
                    smallestDiskCurrentPlace = i;
                    smallestDiskPreviousPlace = k;
                    iterativeSB.append("k->i").append("\n");


                }
                smallestWasMoved = true;

            }
        }


    }

}
