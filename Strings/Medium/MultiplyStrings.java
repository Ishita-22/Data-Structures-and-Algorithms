/**
 * Problem Name: Multiply Strings
 * Difficulty: Medium
 *
 * Problem Statement:
 * Multiply two numbers represented as strings.
 *
 * Pseudocode:
 * 1. Use array to store multiplication
 * 2. Multiply digits from right
 * 3. Handle carry
 *
 * Approach:
 * Simulate manual multiplication.
 *
 * Time Complexity: O(n*m)
 * Space Complexity: O(n+m)
 *
 * Example:
 * Input: "123","456"
 * Output: "56088"
 */

public class MultiplyStrings {

    public static String multiply(String num1, String num2) {

        int[] result = new int[num1.length() + num2.length()];

        for(int i = num1.length() - 1; i >= 0; i--) {

            for(int j = num2.length() - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0')
                        * (num2.charAt(j) - '0');

                int sum = mul + result[i + j + 1];

                result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int num : result)
            if(!(sb.length() == 0 && num == 0))
                sb.append(num);

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123","456"));
    }
}
