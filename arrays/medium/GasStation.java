package arrays.medium;

import java.util.Arrays;

public class GasStation {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
        System.out.println(canCompleteCircuit(new int[]{5, 8, 2, 8}, new int[]{6, 5, 6, 6}));
    }

    public static int canCompleteCircuit (int[] gas, int[] cost) {
        int min = Integer.MAX_VALUE, start= 0;
        for (int i=0; i < cost.length; i++) {
            if (min >= cost[i]) {
                min = cost[i];
                start = i;
            }
        }

        int initial = start;
        int tank = gas[start], nextStation = (start < gas.length-1)? start +1 : 0;

        while(nextStation != initial) {
            tank = (tank - cost[start]) + gas[nextStation];
            nextStation = (nextStation < gas.length-1)? nextStation +1 : 0;
            start = (start < gas.length-1)? start +1 : 0;

        }
        if (tank >= cost[start]) {
            return initial;
        }
        else {
            return -1;
        }
    }
}
