/**
 * Problem Name: Find Duplicate Number
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the duplicate number in the array.
 *
 * Pseudocode:
 * 1. Traverse array:
 *    - Take absolute value index
 *    - If nums[index] is negative → duplicate found
 *    - Else mark nums[index] negative
 *
 * Approach:
 * Use index marking technique.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,3,4,2,2]
 * Output: 2
 */

public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);

            if(nums[index] < 0)
                return index;

            nums[index] = -nums[index];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
