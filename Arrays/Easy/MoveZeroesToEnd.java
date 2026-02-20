/**
 * Problem Name: Move Zeroes to End
 * Difficulty: Easy
 *
 * Problem Statement:
 * Move all zeroes to the end of the array while maintaining the relative order of non-zero elements.
 *
 * Pseudocode:
 * 1. Initialize index = 0
 * 2. Traverse array:
 *    - If arr[i] != 0 → swap with arr[index] and increment index
 *
 * Approach:
 * Use two-pointer technique to shift non-zero elements forward.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

import java.util.*;

public class MoveZeroesToEnd {

    public static void moveZeroes(int[] nums) {

        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
