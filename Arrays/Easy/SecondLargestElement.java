/**
 * Problem Name: Second Largest Element in Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the second largest element in an array of integers.
 *
 * Pseudocode:
 * 1. Initialize first and second as Integer.MIN_VALUE
 * 2. Traverse array:
 *    - If arr[i] > first → update second = first, first = arr[i]
 *    - Else if arr[i] > second && arr[i] != first → update second
 *
 * Approach:
 * Track largest and second largest in single traversal.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [12,35,1,10,34,1]
 * Output: 34
 */

public class SecondLargestElement {

    public static int secondLargest(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            } else if(num > second && num != first) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,1};
        System.out.println(secondLargest(arr));
    }
}
