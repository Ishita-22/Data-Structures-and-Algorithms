/**
 * Problem Name: Decode String
 * Difficulty: Medium
 *
 * Problem Statement:
 * Decode encoded strings like "3[a2[c]]".
 *
 * Pseudocode:
 * 1. Use two stacks
 * 2. Store counts and previous strings
 * 3. Build decoded result
 *
 * Approach:
 * Stack-based decoding of nested patterns.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "3[a2[c]]"
 * Output: "accaccacc"
 */

import java.util.*;

public class DecodeString {

    public static String decodeString(String s) {

        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> results = new Stack<>();

        StringBuilder current = new StringBuilder();
        int k = 0;

        for(char c : s.toCharArray()) {

            if(Character.isDigit(c))
                k = k * 10 + (c - '0');

            else if(c == '[') {
                counts.push(k);
                results.push(current);
                current = new StringBuilder();
                k = 0;
            }

            else if(c == ']') {
                StringBuilder temp = current;
                current = results.pop();
                int repeat = counts.pop();

                for(int i = 0; i < repeat; i++)
                    current.append(temp);
            }

            else
                current.append(c);
        }

        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}
