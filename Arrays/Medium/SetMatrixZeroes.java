/**
 * Problem Name: Set Matrix Zeroes
 * Difficulty: Medium
 *
 * Problem Statement:
 * If an element is 0, set its entire row and column to 0.
 *
 * Pseudocode:
 * 1. Use first row and column as markers
 * 2. Traverse matrix and mark rows & columns
 * 3. Update cells based on markers
 *
 * Approach:
 * Use in-place marking to avoid extra space.
 *
 * Time Complexity: O(m*n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 */

import java.util.*;

public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length, cols = matrix[0].length;
        boolean firstCol = false;

        for(int i = 0; i < rows; i++) {
            if(matrix[i][0] == 0)
                firstCol = true;

            for(int j = 1; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == 0) {
            for(int j = 0; j < cols; j++)
                matrix[0][j] = 0;
        }

        if(firstCol) {
            for(int i = 0; i < rows; i++)
                matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
