/**
 * Problem Name: Count Words in Sentence
 * Difficulty: Easy
 *
 * Problem Statement:
 * Count number of words in a sentence.
 *
 * Pseudocode:
 * 1. Trim spaces
 * 2. Split string by space
 * 3. Return length of array
 *
 * Approach:
 * Use string splitting.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "Java is fun"
 * Output: 3
 */

public class CountWords {

    public static int countWords(String s) {

        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Java is fun"));
    }
}
