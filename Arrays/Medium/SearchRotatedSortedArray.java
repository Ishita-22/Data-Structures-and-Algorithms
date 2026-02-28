/**
 * Problem Name: Search in Rotated Sorted Array
 * Difficulty: Medium
 *
 * Problem Statement:
 * Search target in rotated sorted array.
 *
 * Pseudocode:
 * 1. Apply Binary Search
 * 2. Identify sorted half
 * 3. Narrow search range
 *
 * Approach:
 * Use modified binary search.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Example:
 * Input: [4,5,6,7,0,1,2], target=0
 * Output: 4
 */

public class SearchRotatedSortedArray {

    public static int search(int[] nums,int target) {

        int left=0,right=nums.length-1;

        while(left<=right) {
            int mid=(left+right)/2;

            if(nums[mid]==target)
                return mid;

            if(nums[left]<=nums[mid]) {
                if(target>=nums[left] && target<nums[mid])
                    right=mid-1;
                else
                    left=mid+1;
            } else {
                if(target>nums[mid] && target<=nums[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
    }
}
