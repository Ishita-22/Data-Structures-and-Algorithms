/**
 * Problem Name: Longest Common Prefix
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find the longest common prefix string among an array of strings.
 *
 * Pseudocode:
 * 1. Assume prefix = first string
 * 2. Compare prefix with each string
 * 3. Reduce prefix until match
 *
 * Approach:
 * Gradually shrink the prefix until all strings start with it.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 */

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
