/**
 * Problem Name: Suffix Array Pattern Search
 * Difficulty: Hard
 *
 * Problem Statement:
 * Search pattern in text using suffix array.
 *
 * Pseudocode:
 * 1. Build suffix array
 * 2. Binary search pattern
 *
 * Approach:
 * Binary search over sorted suffixes enables efficient pattern search.
 *
 * Time Complexity: O(m log n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: text="banana", pattern="ana"
 * Output: 1
 */

import java.util.*;

public class SuffixArraySearch {

    public static int search(String text, String pattern) {

        int n = text.length();

        String[] suffixes = new String[n];
        Integer[] index = new Integer[n];

        for(int i=0;i<n;i++) {
            suffixes[i] = text.substring(i);
            index[i] = i;
        }

        Arrays.sort(index,
                (a,b)->suffixes[a].compareTo(suffixes[b]));

        int left = 0, right = n-1;

        while(left <= right) {

            int mid = (left + right)/2;

            String suffix = text.substring(index[mid]);

            if(suffix.startsWith(pattern))
                return index[mid];

            if(suffix.compareTo(pattern) < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search("banana","ana"));
    }
}
