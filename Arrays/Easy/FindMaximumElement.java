/**
 * Problem Name: Find Maximum Element in Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the maximum element in the given integer array.
 *
 * Pseudocode:
 * 1. Initialize max with first element.
 * 2. Traverse array.
 * 3. Update max if current element > max.
 *
 * Approach:
 * Simple linear traversal to track maximum element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [3,5,1,8,2]
 * Output: 8
 */

public class FindMaximumElement {

    public static int findMax(int[] arr) {

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,8,2};
        System.out.println(findMax(arr));
    }
}
