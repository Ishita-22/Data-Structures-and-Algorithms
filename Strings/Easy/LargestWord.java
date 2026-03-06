/**
 * Problem Name: Largest Word in Sentence
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the longest word in a sentence.
 *
 * Pseudocode:
 * 1. Split sentence into words
 * 2. Track max length word
 *
 * Approach:
 * Use string splitting and comparison.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "Java programming language"
 * Output: "programming"
 */

public class LargestWord {

    public static String largestWord(String s) {

        String[] words = s.split(" ");
        String longest = "";

        for(String word : words) {
            if(word.length() > longest.length())
                longest = word;
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(largestWord("Java programming language"));
    }
}
