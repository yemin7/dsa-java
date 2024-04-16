package arrays.hard;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1, 0, 2}));
        System.out.println(candy(new int[]{1, 2, 2}));
        System.out.println(candy(new int[]{1, 3, 2, 2, 1}));
        System.out.println(candy(new int[]{1,2,87,87,87,2,1}));
    }

    public static int candy (int[] ratings) {
        int[] candyArray = new int[ratings.length];
        Arrays.fill(candyArray, 1);

        for (int i=1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                candyArray[i] = candyArray[i-1] +1;
            }
        }

        for ( int i=candyArray.length-2; i >=0; i--) {
            if (ratings[i] > ratings[i+1]) {
                candyArray[i] = Math.max(candyArray[i], candyArray[i+1] + 1);
            }
        }

        System.out.println(Arrays.toString(candyArray));

        int sum =0;
        for (int i: candyArray) {
            sum += i;
        }
        return sum;
    }
}
