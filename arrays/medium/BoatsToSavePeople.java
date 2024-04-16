package arrays.medium;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1, 2}, 3));
        System.out.println(numRescueBoats(new int[]{3,2,2,1}, 3));
        System.out.println(numRescueBoats(new int[]{3,5,3,4}, 5));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int boat = 0;
        int end = people.length-1;
        int start = 0;

        Arrays.sort(people);

        while (start <= end) {
            if(people[start] + people[end] <= limit) {
                start ++;
            }
            end --;
            boat ++;
        }

        return boat;
    }
}
