/**
 * Problem Name: Suffix Array Construction
 * Difficulty: Hard
 *
 * Problem Statement:
 * Construct suffix array of a string.
 *
 * Pseudocode:
 * 1. Generate all suffixes
 * 2. Sort suffixes
 * 3. Store starting indices
 *
 * Approach:
 * Suffix arrays allow efficient substring search and pattern matching.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "banana"
 * Output: [5,3,1,0,4,2]
 */

import java.util.*;

public class SuffixArray {

    public static int[] buildSuffixArray(String s) {

        int n = s.length();
        String[] suffixes = new String[n];
        Integer[] index = new Integer[n];

        for(int i=0;i<n;i++) {
            suffixes[i] = s.substring(i);
            index[i] = i;
        }

        Arrays.sort(index,
                (a,b)->suffixes[a].compareTo(suffixes[b]));

        int[] result = new int[n];
        for(int i=0;i<n;i++)
            result[i] = index[i];

        return result;
    }

    public static void main(String[] args) {

        int[] sa = buildSuffixArray("banana");

        System.out.println(Arrays.toString(sa));
    }
}
