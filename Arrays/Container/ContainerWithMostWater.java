package Arrays.Container;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {4,3,2,1,4};
        int[] height3 = {2, 1,2,1};
        System.out.println(maxArea(height));
        System.out.println(maxArea(height2));
        System.out.println(maxArea(height3));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length-1;

        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            if ( height[left] < height[right]) {
                left ++;
            }else {
                right --;
            }
        }
        return maxArea;
    }
}
