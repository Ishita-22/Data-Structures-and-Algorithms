/**
 * Problem Name: Rabin-Karp Pattern Matching
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find pattern occurrences in text using hashing.
 *
 * Pseudocode:
 * 1. Compute hash of pattern
 * 2. Slide window in text
 * 3. Compare hashes and verify substring
 *
 * Approach:
 * Rolling hash speeds up substring matching.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: text="hello", pattern="ll"
 * Output: 2
 */

public class RabinKarpSearch {

    static final int d = 256;
    static final int q = 101;

    public static int search(String text, String pattern) {

        int m = pattern.length();
        int n = text.length();
        int p = 0, t = 0, h = 1;

        for(int i = 0; i < m-1; i++)
            h = (h * d) % q;

        for(int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        for(int i = 0; i <= n - m; i++) {

            if(p == t) {
                int j = 0;
                while(j < m && text.charAt(i+j)
                        == pattern.charAt(j))
                    j++;

                if(j == m)
                    return i;
            }

            if(i < n-m) {
                t = (d*(t - text.charAt(i)*h)
                        + text.charAt(i+m)) % q;

                if(t < 0)
                    t += q;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search("hello","ll"));
    }
}
