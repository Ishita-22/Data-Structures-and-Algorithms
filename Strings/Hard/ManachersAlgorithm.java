/**
 * Problem Name: Manacher's Algorithm
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find the longest palindromic substring in linear time.
 *
 * Pseudocode:
 * 1. Transform string with separators (#)
 * 2. Use center and right boundary
 * 3. Expand palindrome radius
 *
 * Approach:
 * Manacher's algorithm uses symmetry to reuse previously computed results
 * and achieve O(n) complexity.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "babad"
 * Output: "bab"
 */

public class ManachersAlgorithm {

    public static String longestPalindrome(String s) {

        StringBuilder t = new StringBuilder("#");
        for(char c : s.toCharArray())
            t.append(c).append("#");

        int[] p = new int[t.length()];
        int center = 0, right = 0;
        int maxLen = 0, centerIndex = 0;

        for(int i = 0; i < t.length(); i++) {

            int mirror = 2*center - i;

            if(i < right)
                p[i] = Math.min(right-i, p[mirror]);

            int a = i + p[i] + 1;
            int b = i - p[i] - 1;

            while(a < t.length() && b >= 0 &&
                    t.charAt(a) == t.charAt(b)) {
                p[i]++;
                a++;
                b--;
            }

            if(i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if(p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen)/2;
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
