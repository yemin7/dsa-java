package arrays.easy;

import java.util.Arrays;

public class IsCenteredArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,2,1,4,5};
        int[] array3 = {3, 2, 1, 4, 1};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {};
        int[] array6 = {10};
        System.out.println(isCentered(array1));
        System.out.println(isCentered(array2));
        System.out.println(isCentered(array3));
        System.out.println(isCentered(array4));
        System.out.println(isCentered(array5));
        System.out.println(isCentered(array6));
    }

    public static int isCentered ( int[] array) {
        if (array.length % 2 == 0) {
            return 0;
        }

        if (array.length > 1 ) {
            int mid = array.length / 2;
            for ( int j = 0; j < array.length; j ++) {
                if (j != mid && array[mid] >= array[j]) {
                    return 0;
                }
            }
        }
        return 1;
    }

}
