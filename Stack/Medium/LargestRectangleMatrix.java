/**
 * Problem Name: Largest Rectangle in Binary Matrix
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find largest rectangle of 1's in binary matrix.
 *
 * Approach:
 * Convert rows into histogram and reuse histogram logic.
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(m)
 */

import java.util.*;

public class LargestRectangleMatrix {

    public static int maximalRectangle(char[][] matrix){

        if(matrix.length == 0) return 0;

        int[] heights = new int[matrix[0].length];
        int max = 0;

        for(char[] row : matrix){

            for(int i=0;i<row.length;i++)
                heights[i] = row[i]=='1' ? heights[i]+1 : 0;

            max = Math.max(max, histogram(heights));
        }

        return max;
    }

    private static int histogram(int[] heights){

        Stack<Integer> stack = new Stack<>();
        int max = 0;

        for(int i=0;i<=heights.length;i++){

            int h = (i==heights.length)?0:heights[i];

            while(!stack.isEmpty() &&
                  h < heights[stack.peek()]){

                int height = heights[stack.pop()];
                int width = stack.isEmpty()?i:i-stack.peek()-1;

                max = Math.max(max, height*width);
            }

            stack.push(i);
        }

        return max;
    }
}
