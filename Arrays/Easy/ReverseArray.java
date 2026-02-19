/**
 * Problem Name: Reverse an Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Reverse the given array in-place.
 *
 * Pseudocode:
 * 1. Initialize start = 0, end = n-1
 * 2. Swap arr[start] and arr[end]
 * 3. Increment start, decrement end
 * 4. Repeat until start < end
 *
 * Approach:
 * Use two-pointer technique to reverse in-place.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,2,3,4]
 * Output: [4,3,2,1]
 */

import java.util.*;

public class ReverseArray {

    public static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
