package arrays.easy;

import java.util.Arrays;

/*
Example 1:
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

Example 2:
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
*/
public class Concatenation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(1, 2, 1, 1, 2, 1)));
    }

    public static int[] getConcatenation(int... nums) {
        int[] ans = new int[nums.length*2];
        int pos = 0, count = 2;

        while(count > 0) {
            for (int i: nums) {
                ans[pos++] = i;
            }
            count --;
        }
        return ans;
    }
}
