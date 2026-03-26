/**
 * Problem Name: Celebrity Problem
 * Difficulty: Easy
 *
 * Problem Statement:
 * Find celebrity who knows nobody but is known by everyone.
 *
 * Approach:
 * Use stack elimination.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class CelebrityProblem {

    static boolean knows(int[][] M, int a, int b){
        return M[a][b] == 1;
    }

    public static int findCelebrity(int[][] M, int n){

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++)
            stack.push(i);

        while(stack.size() > 1){

            int a = stack.pop();
            int b = stack.pop();

            if(knows(M,a,b))
                stack.push(b);
            else
                stack.push(a);
        }

        int candidate = stack.pop();

        for(int i=0;i<n;i++){
            if(i!=candidate &&
                (knows(M,candidate,i) || !knows(M,i,candidate)))
                return -1;
        }

        return candidate;
    }
}
