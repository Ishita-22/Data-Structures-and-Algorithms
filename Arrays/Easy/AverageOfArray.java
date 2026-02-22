/**
 * Problem Name: Find Average of Array Elements
 * Difficulty: Easy
 *
 * Problem Statement:
 * Calculate the average of elements in the array.
 *
 * Pseudocode:
 * 1. Initialize sum = 0
 * 2. Traverse array and add elements
 * 3. Average = sum / n
 *
 * Approach:
 * Compute sum first and divide by total count.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [2,4,6,8]
 * Output: 5.0
 */

public class AverageOfArray {

    public static double average(int[] arr) {

        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        System.out.println(average(arr));
    }
}
