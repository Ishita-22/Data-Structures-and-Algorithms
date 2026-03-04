/**
 * Problem Name: Reverse Words in a String
 * Difficulty: Easy
 *
 * Problem Statement:
 * Reverse the order of words in a sentence.
 *
 * Pseudocode:
 * 1. Trim spaces
 * 2. Split words
 * 3. Reverse order
 *
 * Approach:
 * Use split and rebuild string in reverse order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 */

public class ReverseWordsString {

    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i = words.length-1; i >= 0; i--) {
            result.append(words[i]);
            if(i != 0)
                result.append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
