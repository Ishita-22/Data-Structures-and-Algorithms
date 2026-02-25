/**
 * Problem Name: Rearrange Array by Sign
 * Difficulty: Medium
 *
 * Problem Statement:
 * Rearrange array so that positive and negative numbers alternate.
 *
 * Pseudocode:
 * 1. Create result array
 * 2. Maintain posIndex = 0, negIndex = 1
 * 3. Traverse array:
 *    - Place positives at posIndex
 *    - Place negatives at negIndex
 *
 * Approach:
 * Use two indices to place elements alternately.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [3,1,-2,-5,2,-4]
 * Output: [3,-2,1,-5,2,-4]
 */

import java.util.*;

public class RearrangeBySign {

    public static int[] rearrange(int[] nums) {

        int[] result = new int[nums.length];
        int pos = 0, neg = 1;

        for(int num : nums) {
            if(num >= 0) {
                result[pos] = num;
                pos += 2;
            } else {
                result[neg] = num;
                neg += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrange(nums)));
    }
}
