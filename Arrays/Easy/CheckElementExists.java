/**
 * Problem Name: Check if Element Exists in Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check whether a given element exists in the array.
 *
 * Pseudocode:
 * 1. Traverse array:
 *    - If arr[i] == target → return true
 * 2. Return false
 *
 * Approach:
 * Use linear search to check presence.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [4,2,7,1], target = 5
 * Output: false
 */

public class CheckElementExists {

    public static boolean exists(int[] arr, int target) {

        for(int num : arr) {
            if(num == target)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,7,1};
        int target = 5;
        System.out.println(exists(arr, target));
    }
}
