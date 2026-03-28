/**
 * Problem Name: Sum of Subarray Minimums
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find sum of minimums of all subarrays.
 *
 * Approach:
 * Use monotonic stack to find contribution.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class SumSubarrayMinimums {

    public static int sumSubarrayMins(int[] arr){

        int n = arr.length;
        long res = 0;
        int MOD = 1000000007;

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<=n;i++){

            int curr = (i==n) ? 0 : arr[i];

            while(!stack.isEmpty() &&
                  arr[stack.peek()] > curr){

                int mid = stack.pop();
                int left = stack.isEmpty() ? mid+1 : mid - stack.peek();
                int right = i - mid;

                res += (long)arr[mid] * left * right;
                res %= MOD;
            }

            stack.push(i);
        }

        return (int)res;
    }
}
