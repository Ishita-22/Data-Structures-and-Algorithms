/**
 * Problem Name: First Missing Positive
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find the smallest missing positive integer.
 *
 * Pseudocode:
 * 1. Place each number at index num-1
 * 2. Traverse and find mismatch
 *
 * Approach:
 * Use cyclic sort to position numbers.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [3,4,-1,1]
 * Output: 2
 */

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {

        int n=nums.length;

        for(int i=0;i<n;i++) {
            while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i]) {
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }

        for(int i=0;i<n;i++)
            if(nums[i]!=i+1)
                return i+1;

        return n+1;
    }

    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
}
