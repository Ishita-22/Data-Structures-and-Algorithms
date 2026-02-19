/**
 * Problem Name: Check if Array is Sorted
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check whether the given array is sorted in non-decreasing order.
 *
 * Pseudocode:
 * 1. Traverse from index 1 to n-1.
 * 2. If arr[i] < arr[i-1] → return false.
 * 3. Else continue.
 *
 * Approach:
 * Compare each element with its previous element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,2,3,4]
 * Output: true
 */

public class CheckIfArrayIsSorted {

    public static boolean isSorted(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(isSorted(arr));
    }
}
