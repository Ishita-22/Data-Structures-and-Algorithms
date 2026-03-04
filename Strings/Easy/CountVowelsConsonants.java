/**
 * Problem Name: Count Vowels and Consonants
 * Difficulty: Easy
 *
 * Problem Statement:
 * Count vowels and consonants in a string.
 *
 * Pseudocode:
 * 1. Traverse characters
 * 2. Check vowel set
 *
 * Approach:
 * Character classification using condition checks.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "hello"
 * Output: Vowels=2 Consonants=3
 */

public class CountVowelsConsonants {

    public static void count(String s) {

        int vowels = 0, consonants = 0;

        for(char c : s.toLowerCase().toCharArray()) {

            if(Character.isLetter(c)) {

                if("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels=" + vowels + " Consonants=" + consonants);
    }

    public static void main(String[] args) {
        count("hello");
    }
}
