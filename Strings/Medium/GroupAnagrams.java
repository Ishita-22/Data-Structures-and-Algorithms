/**
 * Problem Name: Group Anagrams
 * Difficulty: Medium
 *
 * Problem Statement:
 * Group strings that are anagrams.
 *
 * Pseudocode:
 * 1. Sort each string
 * 2. Use sorted string as key in HashMap
 * 3. Add original string to map list
 *
 * Approach:
 * Sorted strings share identical character order for anagrams.
 *
 * Time Complexity: O(n * k log k)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: ["eat","tea","tan","ate","nat","bat"]
 * Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
 */

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
