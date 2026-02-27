/**
 * Problem Name: Sort Colors
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given an array containing 0s, 1s, and 2s, sort it in-place.
 *
 * Pseudocode:
 * 1. Initialize low=0, mid=0, high=n-1
 * 2. While mid <= high:
 *    - If nums[mid] == 0 → swap(low,mid), low++, mid++
 *    - If nums[mid] == 1 → mid++
 *    - If nums[mid] == 2 → swap(mid,high), high--
 *
 * Approach:
 * Use Dutch National Flag algorithm for one-pass sort.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */

import java.util.*;

public class SortColors {

    public static void sortColors(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
