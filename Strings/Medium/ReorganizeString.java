/**
 * Problem Name: Reorganize String
 * Difficulty: Medium
 *
 * Problem Statement:
 * Rearrange the characters in a string so that no two adjacent characters are the same.
 * If not possible, return an empty string.
 *
 * Pseudocode:
 * 1. Count frequency of characters
 * 2. Use max heap to always pick most frequent char
 * 3. Append char and reinsert previous char if remaining
 *
 * Approach:
 * Greedy approach using max heap ensures the most frequent characters are spaced apart.
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 *
 * Example:
 * Input: "aab"
 * Output: "aba"
 */

import java.util.*;

public class ReorganizeString {

    public static String reorganizeString(String s) {

        int[] freq = new int[26];
        for(char c : s.toCharArray())
            freq[c - 'a']++;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b) -> b[1] - a[1]);

        for(int i=0;i<26;i++)
            if(freq[i] > 0)
                pq.add(new int[]{i, freq[i]});

        StringBuilder result = new StringBuilder();
        int[] prev = null;

        while(!pq.isEmpty()) {

            int[] curr = pq.poll();
            result.append((char)(curr[0] + 'a'));
            curr[1]--;

            if(prev != null && prev[1] > 0)
                pq.add(prev);

            prev = curr;
        }

        if(result.length() != s.length())
            return "";

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aab"));
    }
}
