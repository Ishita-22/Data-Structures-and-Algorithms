/**
 * Problem Name: Distinct Subsequences
 * Difficulty: Hard
 *
 * Problem Statement:
 * Count number of distinct subsequences of s equal to t.
 *
 * Pseudocode:
 * 1. Use DP table
 * 2. dp[i][j] = ways using first i chars of s and j chars of t
 *
 * Approach:
 * Dynamic programming tracks subsequence formation.
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(n*m)
 *
 * Example:
 * Input: s="rabbbit", t="rabbit"
 * Output: 3
 */

public class DistinctSubsequences {

    public static int numDistinct(String s, String t) {

        int m = s.length(), n = t.length();

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++)
            dp[i][0] = 1;

        for(int i=1;i<=m;i++) {

            for(int j=1;j<=n;j++) {

                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(
                numDistinct("rabbbit","rabbit"));
    }
}
