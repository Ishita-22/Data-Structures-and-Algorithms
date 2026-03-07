/**
 * Problem Name: One Edit Away
 * Difficulty: Medium
 *
 * Problem Statement:
 * Check if two strings are at most one edit apart
 * (insert, delete, replace).
 *
 * Pseudocode:
 * 1. If length difference > 1 return false
 * 2. Traverse both strings
 * 3. Track edit count
 *
 * Approach:
 * Compare characters while allowing one modification.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "pale","ple"
 * Output: true
 */

public class OneEditAway {

    public static boolean oneEditAway(String s1, String s2) {

        if(Math.abs(s1.length() - s2.length()) > 1)
            return false;

        int i = 0, j = 0, edits = 0;

        while(i < s1.length() && j < s2.length()) {

            if(s1.charAt(i) != s2.charAt(j)) {

                if(edits == 1)
                    return false;

                edits++;

                if(s1.length() > s2.length())
                    i++;
                else if(s2.length() > s1.length())
                    j++;
                else {
                    i++;
                    j++;
                }

            } else {
                i++;
                j++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("pale","ple"));
    }
}
