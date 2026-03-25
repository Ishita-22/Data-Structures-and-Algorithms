/**
 * Problem Name: Next Smaller Element
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find next smaller element for each element.
 *
 * Pseudocode:
 * 1. Traverse from right
 * 2. Maintain increasing stack
 *
 * Approach:
 * Monotonic stack (increasing) gives next smaller element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class NextSmallerElement {

    public static int[] nextSmaller(int[] nums){

        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek() >= nums[i])
                stack.pop();

            res[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(nums[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,2,10,8};
        System.out.println(Arrays.toString(nextSmaller(nums)));
    }
}
