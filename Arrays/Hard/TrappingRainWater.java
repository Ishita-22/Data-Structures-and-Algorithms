/**
 * Problem Name: Trapping Rain Water
 * Difficulty: Hard
 *
 * Problem Statement:
 * Calculate how much water can be trapped after raining.
 *
 * Pseudocode:
 * 1. Use two pointers left & right
 * 2. Maintain leftMax & rightMax
 * 3. Move pointer with smaller height
 *
 * Approach:
 * Use two-pointer technique to compute trapped water.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */

public class TrappingRainWater {

    public static int trap(int[] height) {

        int left=0,right=height.length-1;
        int leftMax=0,rightMax=0,water=0;

        while(left<right) {
            if(height[left]<height[right]) {
                if(height[left]>=leftMax)
                    leftMax=height[left];
                else
                    water+=leftMax-height[left];
                left++;
            } else {
                if(height[right]>=rightMax)
                    rightMax=height[right];
                else
                    water+=rightMax-height[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
