package arrays.medium;

import java.util.Arrays;

public class CharArrayStartPosition {
    public static void main(String[] args) {
        char[] a = {'a','b','c'};
//        char[] a = {};
        System.out.println(Arrays.toString(f(a, 0, 3)));
    }

    public static char[] f (char[] a, int start, int len) {
        try{
            if (a.length > 0 && (start + len) <= a.length && start >= 0) {
                char[] newChar = new char[len];
                for (int i=0; i < len; i++ ) {
                    newChar[i] = a[start++];
                }
                return newChar;
        }
        }catch (ArrayIndexOutOfBoundsException ignored) {
        }
        return null;
    }
}
