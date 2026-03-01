/**
 * Problem Name: Sliding Window Maximum
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find max in every window of size k.
 *
 * Pseudocode:
 * 1. Use Deque
 * 2. Remove out-of-window
 * 3. Maintain decreasing order
 *
 * Approach:
 * Monotonic deque for window max.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 *
 * Example:
 * Input: [1,3,-1,-3,5,3,6,7], k=3
 * Output: [3,3,5,5,6,7]
 */

import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums,int k) {

        Deque<Integer> dq=new LinkedList<>();
        int[] res=new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++) {

            while(!dq.isEmpty() && dq.peek()<i-k+1)
                dq.poll();

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
                dq.pollLast();

            dq.offer(i);

            if(i>=k-1)
                res[i-k+1]=nums[dq.peek()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3)));
    }
}
