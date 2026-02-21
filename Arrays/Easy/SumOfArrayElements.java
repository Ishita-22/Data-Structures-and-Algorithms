/**
 * Problem Name: Sum of All Elements in Array
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the sum of all elements in the array.
 *
 * Pseudocode:
 * 1. Initialize sum = 0
 * 2. Traverse array and add each element to sum
 *
 * Approach:
 * Use simple iteration to accumulate sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,2,3,4]
 * Output: 10
 */

public class SumOfArrayElements {

    public static int sum(int[] arr) {

        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sum(arr));
    }
}
