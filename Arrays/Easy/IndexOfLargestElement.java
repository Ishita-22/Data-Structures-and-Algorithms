/**
 * Problem Name: Find Index of Largest Element
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the index of the largest element in the array.
 *
 * Pseudocode:
 * 1. Initialize maxIndex = 0
 * 2. Traverse from 1 to n-1:
 *    - If arr[i] > arr[maxIndex] → update maxIndex
 *
 * Approach:
 * Track index of maximum element during traversal.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [3,9,1,7]
 * Output: 1
 */

public class IndexOfLargestElement {

    public static int findIndex(int[] arr) {

        int maxIndex = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {3,9,1,7};
        System.out.println(findIndex(arr));
    }
}
