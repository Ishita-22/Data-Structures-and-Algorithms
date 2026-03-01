/**
 * Problem Name: Largest Rectangle in Histogram
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find largest rectangle area in histogram.
 *
 * Pseudocode:
 * 1. Use stack
 * 2. Pop when height decreases
 * 3. Calculate area
 *
 * Approach:
 * Monotonic stack for area calculation.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [2,1,5,6,2,3]
 * Output: 10
 */

import java.util.*;

public class LargestRectangleHistogram {

    public static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack=new Stack<>();
        int max=0,n=heights.length;

        for(int i=0;i<=n;i++) {

            int h=(i==n)?0:heights[i];

            while(!stack.isEmpty() && h<heights[stack.peek()]) {
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                max=Math.max(max,height*width);
            }
            stack.push(i);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
