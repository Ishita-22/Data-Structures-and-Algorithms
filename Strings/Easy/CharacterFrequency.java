/**
 * Problem Name: Character Frequency
 * Difficulty: Easy
 *
 * Problem Statement:
 * Count frequency of each character in a string.
 *
 * Pseudocode:
 * 1. Create array[256]
 * 2. Traverse string
 * 3. Increment count
 *
 * Approach:
 * Use ASCII frequency array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "hello"
 * Output: h=1 e=1 l=2 o=1
 */

public class CharacterFrequency {

    public static void frequency(String s) {

        int[] freq = new int[256];

        for(char c : s.toCharArray())
            freq[c]++;

        for(int i = 0; i < 256; i++) {
            if(freq[i] > 0)
                System.out.println((char)i + " = " + freq[i]);
        }
    }

    public static void main(String[] args) {
        frequency("hello");
    }
}
