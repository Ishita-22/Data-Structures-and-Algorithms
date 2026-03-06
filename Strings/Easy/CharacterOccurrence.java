/**
 * Problem Name: Count Occurrence of Character
 * Difficulty: Easy
 *
 * Problem Statement:
 * Count how many times a given character appears in the string.
 *
 * Pseudocode:
 * 1. Traverse string
 * 2. Increment counter if char matches
 *
 * Approach:
 * Linear scan through string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "banana", char='a'
 * Output: 3
 */

public class CharacterOccurrence {

    public static int count(String s, char target) {

        int count = 0;

        for(char c : s.toCharArray()) {
            if(c == target)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("banana",'a'));
    }
}
