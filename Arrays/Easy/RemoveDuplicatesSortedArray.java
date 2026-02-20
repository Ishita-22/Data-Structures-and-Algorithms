/**
 * Problem Name: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Remove duplicates in-place from sorted array and return new length.
 *
 * Pseudocode:
 * 1. Initialize index = 1
 * 2. Traverse array from 1:
 *    - If nums[i] != nums[i-1]
 *       → nums[index] = nums[i]
 *       → increment index
 *
 * Approach:
 * Use two-pointer method to overwrite duplicates.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,1,2]
 * Output: 2
 */

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {

        if(nums.length == 0) return 0;

        int index = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
