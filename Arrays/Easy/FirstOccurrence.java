/**
 * Problem Name: Find First Occurrence of Element
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the first occurrence index of a target element in the array.
 *
 * Pseudocode:
 * 1. Traverse array from 0 to n-1
 * 2. If arr[i] == target → return i
 * 3. Return -1 if not found
 *
 * Approach:
 * Use linear search to find first occurrence.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [5,3,7,3], target = 3
 * Output: 1
 */

public class FirstOccurrence {

    public static int firstOccurrence(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,7,3};
        int target = 3;
        System.out.println(firstOccurrence(arr, target));
    }
}
