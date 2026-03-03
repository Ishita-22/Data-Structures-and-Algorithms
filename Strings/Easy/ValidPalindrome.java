/**
 * Problem Name: Valid Palindrome
 * Difficulty: Easy
 *
 * Problem Statement:
 * Determine if a string is a palindrome considering only alphanumeric characters
 * and ignoring cases.
 *
 * Pseudocode:
 * 1. Use two pointers (left, right)
 * 2. Skip non-alphanumeric characters
 * 3. Compare lowercase characters
 * 4. If mismatch → return false
 *
 * Approach:
 * Two-pointer technique with character filtering.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 */

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if (Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right)))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
