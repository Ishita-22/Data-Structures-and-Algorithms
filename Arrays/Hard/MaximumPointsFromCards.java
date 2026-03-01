/**
 * Problem Name: Maximum Points from Cards
 * Difficulty: Hard
 *
 * Problem Statement:
 * Pick k cards from either end to maximize score.
 *
 * Pseudocode:
 * 1. Find total sum of first k
 * 2. Slide window replacing left with right
 *
 * Approach:
 * Convert to sliding window problem.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,2,3,4,5,6,1], k=3
 * Output: 12
 */

public class MaximumPointsFromCards {

    public static int maxScore(int[] cardPoints,int k) {

        int n=cardPoints.length;
        int sum=0;

        for(int i=0;i<k;i++)
            sum+=cardPoints[i];

        int max=sum;

        for(int i=0;i<k;i++) {
            sum=sum-cardPoints[k-1-i]+cardPoints[n-1-i];
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1};
        System.out.println(maxScore(arr,3));
    }
}
