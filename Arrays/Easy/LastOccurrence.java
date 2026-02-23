/**
 * Problem Name: Find Last Occurrence of Element
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the last occurrence index of a target element in the array.
 *
 * Pseudocode:
 * 1. Traverse array from n-1 to 0
 * 2. If arr[i] == target → return i
 * 3. Return -1 if not found
 *
 * Approach:
 * Traverse from end to locate last occurrence.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [5,3,7,3], target = 3
 * Output: 3
 */

public class LastOccurrence {

    public static int lastOccurrence(int[] arr, int target) {

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,7,3};
        int target = 3;
        System.out.println(lastOccurrence(arr, target));
    }
}
