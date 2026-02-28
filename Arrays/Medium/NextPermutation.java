/**
 * Problem Name: Next Permutation
 * Difficulty: Medium
 *
 * Problem Statement:
 * Rearrange numbers into the next lexicographically greater permutation.
 *
 * Pseudocode:
 * 1. Find first decreasing element from right
 * 2. Find next greater element
 * 3. Swap them
 * 4. Reverse remaining suffix
 *
 * Approach:
 * Identify pivot and rearrange suffix.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,2,3]
 * Output: [1,3,2]
 */

import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        while(i >= 0 && nums[i] >= nums[i+1])
            i--;

        if(i >= 0) {
            int j = nums.length - 1;
            while(nums[j] <= nums[i])
                j--;

            swap(nums,i,j);
        }

        reverse(nums,i+1);
    }

    private static void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private static void reverse(int[] nums,int start) {
        int end=nums.length-1;
        while(start<end)
            swap(nums,start++,end--);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
