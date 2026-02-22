/**
 * Problem Name: Count Positive and Negative Numbers
 * Difficulty: Easy
 *
 * Problem Statement:
 * Count the number of positive and negative elements in the array.
 *
 * Pseudocode:
 * 1. Initialize positive = 0, negative = 0
 * 2. Traverse array:
 *    - If num > 0 → positive++
 *    - Else if num < 0 → negative++
 *
 * Approach:
 * Use conditional checks to count positive and negative numbers.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [-1,2,-3,4]
 * Output: Positive = 2, Negative = 2
 */

public class CountPositiveNegative {

    public static void count(int[] arr) {

        int positive = 0;
        int negative = 0;

        for(int num : arr) {
            if(num > 0)
                positive++;
            else if(num < 0)
                negative++;
        }

        System.out.println("Positive = " + positive + ", Negative = " + negative);
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4};
        count(arr);
    }
}
