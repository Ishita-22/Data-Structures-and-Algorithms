/**
 * Problem Name: Linear Search
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the index of a target element in the array.
 *
 * Pseudocode:
 * 1. Traverse array:
 *    - If arr[i] == target → return i
 * 2. Return -1 if not found
 *
 * Approach:
 * Check each element sequentially.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [4,2,7,1], target = 7
 * Output: 2
 */

public class LinearSearch {

    public static int search(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,7,1};
        int target = 7;
        System.out.println(search(arr, target));
    }
}
