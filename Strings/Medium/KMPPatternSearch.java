/**
 * Problem Name: KMP Pattern Searching
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the first occurrence of a pattern in a text using KMP algorithm.
 *
 * Pseudocode:
 * 1. Build LPS array
 * 2. Compare pattern and text
 * 3. Jump using LPS when mismatch occurs
 *
 * Approach:
 * KMP avoids redundant comparisons using prefix table.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(m)
 *
 * Example:
 * Input: text="ababcabcabababd", pattern="ababd"
 * Output: 10
 */

public class KMPPatternSearch {

    public static int search(String text, String pattern) {

        int[] lps = buildLPS(pattern);
        int i = 0, j = 0;

        while(i < text.length()) {

            if(text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if(j == pattern.length())
                return i - j;

            else if(i < text.length()
                    && text.charAt(i) != pattern.charAt(j)) {

                if(j != 0)
                    j = lps[j-1];
                else
                    i++;
            }
        }

        return -1;
    }

    private static int[] buildLPS(String pattern) {

        int[] lps = new int[pattern.length()];
        int len = 0, i = 1;

        while(i < pattern.length()) {

            if(pattern.charAt(i) == pattern.charAt(len))
                lps[i++] = ++len;
            else if(len != 0)
                len = lps[len-1];
            else
                lps[i++] = 0;
        }

        return lps;
    }

    public static void main(String[] args) {
        System.out.println(search(
                "ababcabcabababd","ababd"));
    }
}
