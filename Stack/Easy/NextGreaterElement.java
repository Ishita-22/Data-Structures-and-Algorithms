/**
 * Problem Name: Next Greater Element I
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find next greater element for each element.
 *
 * Pseudocode:
 * 1. Use stack
 * 2. Traverse from right
 * 3. Maintain decreasing stack
 *
 * Approach:
 * Monotonic stack helps find next greater efficiently.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreater(int[] nums){

        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek() <= nums[i])
                stack.pop();

            res[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(nums[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,2,10};
        System.out.println(Arrays.toString(nextGreater(nums)));
    }
}
