/**
 * Problem Name: Find Peak Element
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find a peak element in the array.
 *
 * Pseudocode:
 * 1. Use Binary Search
 * 2. Compare mid and mid+1
 * 3. Move towards peak
 *
 * Approach:
 * Use binary search to locate peak.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [1,2,3,1]
 * Output: 2
 */

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {

        int left=0,right=nums.length-1;

        while(left<right) {
            int mid=(left+right)/2;
            if(nums[mid]<nums[mid+1])
                left=mid+1;
            else
                right=mid;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
}
