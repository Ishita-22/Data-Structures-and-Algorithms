/**
 * Problem Name: Find Index of Smallest Element
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the index of the smallest element in the array.
 *
 * Pseudocode:
 * 1. Initialize minIndex = 0
 * 2. Traverse from 1 to n-1:
 *    - If arr[i] < arr[minIndex] → update minIndex
 *
 * Approach:
 * Track index of minimum element during traversal.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [3,9,1,7]
 * Output: 2
 */

public class IndexOfSmallestElement {

    public static int findIndex(int[] arr) {

        int minIndex = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {3,9,1,7};
        System.out.println(findIndex(arr));
    }
}
