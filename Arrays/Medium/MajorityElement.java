/**
 * Problem Name: Majority Element
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the element that appears more than n/2 times in the array.
 *
 * Pseudocode:
 * 1. Initialize count = 0, candidate = 0
 * 2. Traverse array:
 *    - If count == 0 → candidate = num
 *    - If num == candidate → count++
 *    - Else count--
 *
 * Approach:
 * Use Moore’s Voting Algorithm to find majority element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [2,2,1,1,2,2]
 * Output: 2
 */

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int count = 0;
        int candidate = 0;

        for(int num : nums) {
            if(count == 0)
                candidate = num;

            if(num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
