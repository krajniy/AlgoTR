package HWs.hw8;

import java.util.ArrayDeque;
import java.util.Deque;

public class HanoiTowersIterative {
    public static void main(String[] args) {
        int n = 5;
        Deque<Integer> i = new ArrayDeque<>();
        for (int j = n; j > 0; j--) {
            i.push(j);
        }
        Deque<Integer> t = new ArrayDeque<>();
        Deque<Integer> k = new ArrayDeque<>();

        HanoiTowers.printDeques(i, t, k);
        hanoiIterative(n, i, t, k);
        HanoiTowers.printDeques(i, t, k);


    }


    public static void hanoiIterative(int n, Deque<Integer> i, Deque<Integer> t, Deque<Integer> k) {

        if (n == 1) {
            k.push(i.pop());
            System.out.println("i -> k");
            return;
        }

        Deque<Integer> smallestDiskCurrentPlace = null; //текущее положение наименьшего диска
        Deque<Integer> smallestDiskPreviousPlace = null; //прошлое положение наименьшего диска
        boolean smallestWasMoved = false; //двигали наименьший диск?

        //первый ход для четного/нечетного количества дисков
        if (n % 2 == 0) {
            smallestDiskCurrentPlace = t;
            t.push(i.pop());
            System.out.println("i->t");
        } else {
            smallestDiskCurrentPlace = k;
            k.push(i.pop());
            System.out.println("i->k");

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
                        System.out.println("k->t");

                    } else if (t.peek() != null && k.peek() == null) {
                        k.push(t.pop());
                        System.out.println("t->k");

                    } else if (t.peek() > k.peek()) {
                        t.push(k.pop());
                        System.out.println("k->t");

                    } else {
                        k.push(t.pop());
                        System.out.println("t->k");

                    }
                } else if (smallestDiskCurrentPlace == t) {
                    if (i.peek() == null && k.peek() == null) { // все диски на t
                        break;
                    } else if (i.peek() == null && k.peek() != null) {
                        i.push(k.pop());
                        System.out.println("k->i");

                    } else if (i.peek() != null && k.peek() == null) {
                        k.push(i.pop());
                        System.out.println("i->k");

                    } else if (i.peek() > k.peek()) {
                        i.push(k.pop());
                        System.out.println("k->i");

                    } else {
                        k.push(i.pop());
                        System.out.println("i->k");

                    }

                } else {
                    if (i.peek() == null && t.peek() == null) { // все диски на t
                        break;
                    } else if (i.peek() == null && t.peek() != null) {
                        i.push(t.pop());
                        System.out.println("t->i");

                    } else if (i.peek() != null && t.peek() == null) {
                        t.push(i.pop());
                        System.out.println("i->t");

                    } else if (i.peek() > t.peek()) {
                        i.push(t.pop());
                        System.out.println("t->i");

                    } else {
                        t.push(i.pop());
                        System.out.println("i->t");

                    }
                }
                smallestWasMoved = false;

            } else {
                if (smallestDiskCurrentPlace == i && smallestDiskPreviousPlace == t){
                    k.push(i.pop());
                    smallestDiskPreviousPlace = i;
                    smallestDiskCurrentPlace = k;
                    System.out.println("i->k");

                } else if (smallestDiskCurrentPlace == i && smallestDiskPreviousPlace == k) {
                    t.push(i.pop());
                    smallestDiskPreviousPlace = i;
                    smallestDiskCurrentPlace = t;
                    System.out.println("i->t");

                } else if (smallestDiskCurrentPlace == t && smallestDiskPreviousPlace == i){
                    k.push(t.pop());
                    smallestDiskPreviousPlace = t;
                    smallestDiskCurrentPlace = k;
                    System.out.println("t->k");

                } else if (smallestDiskCurrentPlace == t && smallestDiskPreviousPlace == k) {
                    i.push(t.pop());
                    smallestDiskCurrentPlace = i;
                    smallestDiskPreviousPlace = t;
                    System.out.println("t->i");

                } else if (smallestDiskCurrentPlace == k && smallestDiskPreviousPlace == i) {
                    t.push(k.pop());
                    smallestDiskCurrentPlace = t;
                    smallestDiskPreviousPlace = k;
                    System.out.println("k->t");

                } else if (smallestDiskCurrentPlace == k && smallestDiskPreviousPlace == t) {
                    i.push(k.pop());
                    smallestDiskCurrentPlace = i;
                    smallestDiskPreviousPlace = k;
                    System.out.println("k->i");

                }
                smallestWasMoved = true;

            }
        }


    }

}
