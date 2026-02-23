/**
 * Problem Name: Check if Array Contains Only Even Numbers
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check whether all elements in the array are even.
 *
 * Pseudocode:
 * 1. Traverse array:
 *    - If any element % 2 != 0 → return false
 * 2. Return true
 *
 * Approach:
 * Check parity of each element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [2,4,6]
 * Output: true
 */

public class AllEvenNumbers {

    public static boolean checkEven(int[] arr) {

        for(int num : arr) {
            if(num % 2 != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6};
        System.out.println(checkEven(arr));
    }
}
