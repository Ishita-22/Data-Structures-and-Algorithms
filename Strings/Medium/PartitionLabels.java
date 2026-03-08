/**
 * Problem Name: Partition Labels
 * Difficulty: Medium
 *
 * Problem Statement:
 * Partition string so each letter appears in only one part.
 *
 * Pseudocode:
 * 1. Store last occurrence of characters
 * 2. Traverse string and track partition end
 *
 * Approach:
 * Expand partition until last occurrence reached.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "ababcbacadefegdehijhklij"
 * Output: [9,7,8]
 */

import java.util.*;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String s) {

        int[] last = new int[26];
        for(int i = 0; i < s.length(); i++)
            last[s.charAt(i) - 'a'] = i;

        List<Integer> result = new ArrayList<>();

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++) {

            end = Math.max(end, last[s.charAt(i) - 'a']);

            if(i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels(
                "ababcbacadefegdehijhklij"));
    }
}
