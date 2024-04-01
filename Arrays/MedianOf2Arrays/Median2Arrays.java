package Arrays.MedianOf2Arrays;

import java.util.Arrays;
import java.util.Spliterator;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

public class Median2Arrays {

    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};

        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];
        int len = newArray.length;
        int pos = 0; // position

        for (int i : nums1) {
            newArray[pos++] = i;
        }
        for (int j : nums2) {
            newArray[pos++] = j;
        }

        Arrays.sort(newArray);

        if (len %2 != 0) {
            return newArray[ len / 2];
        }
        else {
            double value = newArray[(len/2)] + newArray[(len/2)-1];
            return value/2;
        }
    }
}
