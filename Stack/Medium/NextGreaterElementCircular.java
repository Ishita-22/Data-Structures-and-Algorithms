/**
 * Problem Name: Next Greater Element II (Circular Array)
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find next greater element in circular array.
 *
 * Approach:
 * Traverse array twice using modulo.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class NextGreaterElementCircular {

    public static int[] nextGreater(int[] nums){

        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<2*n;i++){

            int num = nums[i % n];

            while(!stack.isEmpty() &&
                  nums[stack.peek()] < num){
                res[stack.pop()] = num;
            }

            if(i < n)
                stack.push(i);
        }

        return res;
    }
}
