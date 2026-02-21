/**
 * Problem Name: Count Even and Odd Numbers
 * Difficulty: Easy
 *
 * Problem Statement:
 * Count the number of even and odd numbers in the array.
 *
 * Pseudocode:
 * 1. Initialize even = 0, odd = 0
 * 2. Traverse array:
 *    - If arr[i] % 2 == 0 → even++
 *    - Else odd++
 *
 * Approach:
 * Check parity of each element using modulo.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,2,3,4]
 * Output: Even = 2, Odd = 2
 */

public class CountEvenOdd {

    public static void count(int[] arr) {

        int even = 0;
        int odd = 0;

        for(int num : arr) {
            if(num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even + ", Odd = " + odd);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        count(arr);
    }
}
