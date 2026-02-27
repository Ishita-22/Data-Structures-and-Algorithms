/**
 * Problem Name: Spiral Matrix Traversal
 * Difficulty: Medium
 *
 * Problem Statement:
 * Return all elements of the matrix in spiral order.
 *
 * Pseudocode:
 * 1. Define top,bottom,left,right
 * 2. Traverse in spiral direction
 *
 * Approach:
 * Use boundary variables to traverse layers.
 *
 * Time Complexity: O(m*n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 */

import java.util.*;

public class SpiralMatrixTraversal {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int top=0, bottom=matrix.length-1;
        int left=0, right=matrix[0].length-1;

        while(top<=bottom && left<=right) {

            for(int i=left;i<=right;i++)
                result.add(matrix[top][i]);
            top++;

            for(int i=top;i<=bottom;i++)
                result.add(matrix[i][right]);
            right--;

            if(top<=bottom) {
                for(int i=right;i>=left;i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            }

            if(left<=right) {
                for(int i=bottom;i>=top;i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
