package HWs;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {

        System.out.println(isPowOfTwo(128));
        System.out.println(sumOfDigits(179));


    }

    public static boolean isPowOfTwo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 2) {
            return n == 2;
        } else {
            return isPowOfTwo(n / 2);
        }
    }

    public static int sumOfDigits(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }

    }

}

