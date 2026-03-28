/**
 * Problem Name: Trapping Rain Water
 * Difficulty: Medium
 *
 * Problem Statement:
 * Given elevation map, compute trapped water.
 *
 * Pseudocode:
 * 1. Use stack to store indices
 * 2. Calculate water when higher bar found
 *
 * Approach:
 * Stack helps track boundaries of trapped water.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Example:
 * Input: [0,1,0,2,1,0,1,3]
 * Output: 6
 */

import java.util.*;

public class TrappingRainWater {

    public static int trap(int[] height){

        Stack<Integer> stack = new Stack<>();
        int water = 0;

        for(int i=0;i<height.length;i++){

            while(!stack.isEmpty() &&
                  height[i] > height[stack.peek()]){

                int top = stack.pop();

                if(stack.isEmpty()) break;

                int distance = i - stack.peek() - 1;
                int boundedHeight =
                        Math.min(height[i], height[stack.peek()])
                        - height[top];

                water += distance * boundedHeight;
            }

            stack.push(i);
        }

        return water;
    }
}
