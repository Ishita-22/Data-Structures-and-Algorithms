/**
 * Problem Name: Minimum Insertions to Form Palindrome
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find minimum insertions needed to convert string into palindrome.
 *
 * Pseudocode:
 * 1. Compute longest palindromic subsequence
 * 2. Answer = length - LPS
 *
 * Approach:
 * Dynamic programming with LCS of string and reverse.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 *
 * Example:
 * Input: "abcda"
 * Output: 2
 */

public class MinimumInsertionsPalindrome {

    public static int minInsertions(String s) {

        String rev = new StringBuilder(s).reverse().toString();

        int n = s.length();
        int[][] dp = new int[n+1][n+1];

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=n;j++) {

                if(s.charAt(i-1)==rev.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return n - dp[n][n];
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("abcda"));
    }
}
