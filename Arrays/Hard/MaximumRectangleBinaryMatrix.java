/**
 * Problem Name: Maximum Rectangle in Binary Matrix
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find largest rectangle of 1’s in binary matrix.
 *
 * Pseudocode:
 * 1. Convert each row to histogram
 * 2. Apply Largest Rectangle Histogram
 *
 * Approach:
 * Build histogram row by row.
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(m)
 *
 * Example:
 * Input: matrix of 1’s and 0’s
 * Output: max rectangle area
 */

import java.util.*;

public class MaximumRectangleBinaryMatrix {

    public static int maximalRectangle(char[][] matrix) {

        if(matrix.length==0) return 0;
        int[] heights=new int[matrix[0].length];
        int max=0;

        for(char[] row:matrix) {
            for(int i=0;i<row.length;i++)
                heights[i]=row[i]=='1'?heights[i]+1:0;

            max=Math.max(max,largestRectangle(heights));
        }
        return max;
    }

    private static int largestRectangle(int[] heights) {

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
}
