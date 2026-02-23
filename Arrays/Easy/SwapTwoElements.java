/**
 * Problem Name: Swap Two Elements in Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Swap two elements at given indices in the array.
 *
 * Pseudocode:
 * 1. Store arr[i] in temp
 * 2. arr[i] = arr[j]
 * 3. arr[j] = temp
 *
 * Approach:
 * Use temporary variable to swap values.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,2,3,4], i=1, j=3
 * Output: [1,4,3,2]
 */

import java.util.*;

public class SwapTwoElements {

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
}
