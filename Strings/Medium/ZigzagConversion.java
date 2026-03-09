/**
 * Problem Name: Zigzag Conversion
 * Difficulty: Medium
 *
 * Problem Statement:
 * Convert string into zigzag pattern across rows.
 *
 * Pseudocode:
 * 1. Use array of StringBuilders
 * 2. Traverse string changing direction
 *
 * Approach:
 * Simulate zigzag traversal row by row.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: "PAYPALISHIRING", rows=3
 * Output: "PAHNAPLSIIGYIR"
 */

public class ZigzagConversion {

    public static String convert(String s, int numRows) {

        if(numRows == 1)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
            rows[i] = new StringBuilder();

        int index = 0;
        boolean down = true;

        for(char c : s.toCharArray()) {

            rows[index].append(c);

            if(index == 0)
                down = true;
            else if(index == numRows-1)
                down = false;

            index += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows)
            result.append(row);

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
}
