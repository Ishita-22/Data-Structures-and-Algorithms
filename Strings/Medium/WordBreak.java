/**
 * Problem Name: Word Break
 * Difficulty: Medium
 *
 * Problem Statement:
 * Determine if string can be segmented into dictionary words.
 *
 * Pseudocode:
 * 1. Use DP array
 * 2. dp[i] true if substring valid
 *
 * Approach:
 * Dynamic programming checks valid segmentations.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: s="leetcode", dict=["leet","code"]
 * Output: true
 */

import java.util.*;

public class WordBreak {

    public static boolean wordBreak(String s,
                                    List<String> dict) {

        Set<String> set = new HashSet<>(dict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        for(int i=1;i<=s.length();i++) {

            for(int j=0;j<i;j++) {

                if(dp[j] &&
                        set.contains(s.substring(j,i))) {

                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {

        List<String> dict =
                Arrays.asList("leet","code");

        System.out.println(wordBreak(
                "leetcode",dict));
    }
}
