/**
 * Problem Name: Kth Largest Element in Array
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find the kth largest element in the array.
 *
 * Pseudocode:
 * 1. Use Min Heap of size k
 * 2. Add elements
 * 3. If size > k remove smallest
 *
 * Approach:
 * Maintain k largest elements in heap.
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 *
 * Example:
 * Input: [3,2,1,5,6,4], k=2
 * Output: 5
 */

import java.util.*;

public class KthLargestElement {

    public static int findKthLargest(int[] nums,int k) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int num:nums) {
            pq.add(num);
            if(pq.size()>k)
                pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
}
