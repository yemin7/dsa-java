package arrays.medium;
public class MinNumsToAddToGetGoal {
    public static void main(String[] args) {
        int[] nums = {1, -1 , 1};
        int limit = 3, goal = -4;

        //int[] nums = {1,-10,9,1};
        //int limit = 100, goal = 0;
        System.out.println(minElements(nums, limit, goal));
    }
    public static int minElements(int[] nums, int limit, int goal) {
        long sum = 0;

        for(int i: nums) {
            sum += i;
        }
        long tmp = (long)goal - sum;
        return (int)((Math.abs(tmp) + limit - 1) / limit);
    }
}
