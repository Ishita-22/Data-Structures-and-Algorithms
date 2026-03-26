/**
 * Problem Name: Stack Permutations
 * Difficulty: Easy
 *
 * Problem Statement:
 * Check if output is valid stack permutation of input.
 *
 * Approach:
 * Simulate stack push/pop.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class StackPermutation {

    public static boolean isValid(int[] input, int[] output){

        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for(int i=0;i<input.length;i++){

            stack.push(input[i]);

            while(!stack.isEmpty() &&
                  stack.peek() == output[j]){
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}
