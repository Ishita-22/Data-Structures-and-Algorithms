/**
 * Problem Name: Smallest Window Containing All Characters
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find the smallest substring containing all characters of another string.
 *
 * Approach:
 * Sliding window with frequency maps.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.*;

public class SmallestWindowAllChars {

    public static String smallestWindow(String s, String p) {

        int[] freq = new int[256];

        for(char c : p.toCharArray())
            freq[c]++;

        int left = 0, count = p.length();
        int start = 0, minLen = Integer.MAX_VALUE;

        for(int right=0; right<s.length(); right++) {

            if(freq[s.charAt(right)]-- > 0)
                count--;

            while(count == 0) {

                if(right-left+1 < minLen) {
                    start = left;
                    minLen = right-left+1;
                }

                if(++freq[s.charAt(left++)] > 0)
                    count++;
            }
        }

        return minLen == Integer.MAX_VALUE ?
                "" : s.substring(start,start+minLen);
    }

    public static void main(String[] args) {
        System.out.println(
                smallestWindow("this is a test string",
                        "tist"));
    }
}
