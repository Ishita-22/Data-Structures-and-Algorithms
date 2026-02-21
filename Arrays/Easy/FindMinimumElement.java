/**
 * Problem Name: Find Minimum Element in Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the minimum element in the given integer array.
 *
 * Pseudocode:
 * 1. Initialize min with first element.
 * 2. Traverse array.
 * 3. Update min if current element < min.
 *
 * Approach:
 * Use linear traversal to track minimum value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [3,5,1,8,2]
 * Output: 1
 */

public class FindMinimumElement {

    public static int findMin(int[] arr) {

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,8,2};
        System.out.println(findMin(arr));
    }
