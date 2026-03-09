/**
 * Problem Name: Generate Parentheses
 * Difficulty: Medium
 *
 * Problem Statement:
 * Generate all valid combinations of n pairs of parentheses.
 *
 * Pseudocode:
 * 1. Use recursion
 * 2. Add '(' if open < n
 * 3. Add ')' if close < open
 *
 * Approach:
 * Backtracking ensures only valid combinations are built.
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 */

import java.util.*;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }

    private static void backtrack(List<String> result,
                                  String current,
                                  int open,
                                  int close,
                                  int n) {

        if(current.length() == 2*n) {
            result.add(current);
            return;
        }

        if(open < n)
            backtrack(result,current+"(",open+1,close,n);

        if(close < open)
            backtrack(result,current+")",open,close+1,n);
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
