package arrays.easy;

import java.util.Arrays;

public class SumofOddEven {
    public static void main(String[] args) {
        System.out.println(sumOddEven(1));
        System.out.println(sumOddEven(1,2));
        System.out.println(sumOddEven(1,2,3));
        System.out.println(sumOddEven(1,2,3,4));
        System.out.println(sumOddEven(3,3,4,4));
        System.out.println(sumOddEven(3,2,3,4));
        System.out.println(sumOddEven(4,1,2,3));
        System.out.println(sumOddEven(1,1));
        System.out.println(sumOddEven());
    }
    public static int sumOddEven (int... a) {
        int odd = 0, even = 0;

        if (a.length == 0) {
            return 0;
        }
        else {
            for (int i: a) {
                if (i % 2 == 0) {
                    even += i;
                }else {
                    odd += i;
                }
            }
        }
        return odd - even;
    }
}
