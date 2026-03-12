/**
 * Problem Name: Shortest Palindrome
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find the shortest palindrome by adding characters in front of the string.
 *
 * Pseudocode:
 * 1. Reverse string
 * 2. Use KMP prefix table
 * 3. Identify longest palindrome prefix
 *
 * Approach:
 * Combine original and reversed string to detect longest prefix palindrome.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "aacecaaa"
 * Output: "aaacecaaa"
 */

public class ShortestPalindrome {

    public static String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = new int[combined.length()];

        for(int i=1;i<combined.length();i++) {

            int j = lps[i-1];

            while(j>0 && combined.charAt(i)!=combined.charAt(j))
                j = lps[j-1];

            if(combined.charAt(i)==combined.charAt(j))
                j++;

            lps[i] = j;
        }

        return rev.substring(0, s.length() - lps[combined.length()-1]) + s;
    }

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aacecaaa"));
    }
}
