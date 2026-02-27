/**
 * Problem Name: Merge Intervals
 * Difficulty: Medium
 *
 * Problem Statement:
 * Merge all overlapping intervals.
 *
 * Pseudocode:
 * 1. Sort intervals by start time
 * 2. Traverse:
 *    - If overlap → merge
 *    - Else add new interval
 *
 * Approach:
 * Sort intervals and merge overlaps.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 */

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();

        for(int[] interval:intervals) {
            if(result.isEmpty() || result.get(result.size()-1)[1]<interval[0])
                result.add(interval);
            else
                result.get(result.size()-1)[1]=Math.max(result.get(result.size()-1)[1],interval[1]);
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
