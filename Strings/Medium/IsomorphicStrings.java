/**
 * Problem Name: Isomorphic Strings
 * Difficulty: Medium
 *
 * Problem Statement:
 * Two strings are isomorphic if characters in s can be replaced to get t.
 *
 * Pseudocode:
 * 1. Use two maps
 * 2. Ensure mapping consistency
 *
 * Approach:
 * Maintain bidirectional mapping between characters.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "egg","add"
 * Output: true
 */

import java.util.*;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverse = new HashMap<>();

        for(int i=0;i<s.length();i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map.containsKey(c1) && map.get(c1) != c2)
                return false;

            if(reverse.containsKey(c2) && reverse.get(c2) != c1)
                return false;

            map.put(c1,c2);
            reverse.put(c2,c1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
