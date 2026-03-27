/**
 * Problem Name: Largest Rectangle in Histogram
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find largest rectangle area in histogram.
 *
 * Approach:
 * Use monotonic stack to find boundaries.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class LargestRectangleHistogram {

    public static int largestRectangleArea(int[] heights){

        Stack<Integer> stack = new Stack<>();
        int max = 0;

        for(int i=0;i<=heights.length;i++){

            int h = (i==heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && h < heights[stack.peek()]){

                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                max = Math.max(max, height * width);
            }

            stack.push(i);
        }

        return max;
    }

    public static void main(String[] args){
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
