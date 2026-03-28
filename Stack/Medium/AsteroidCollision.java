/**
 * Problem Name: Asteroid Collision
 * Difficulty: Medium
 *
 * Problem Statement:
 * Simulate collisions between asteroids.
 *
 * Approach:
 * Use stack to simulate collisions.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids){

        Stack<Integer> stack = new Stack<>();

        for(int a : asteroids){

            while(!stack.isEmpty() && a < 0 && stack.peek() > 0){

                if(stack.peek() < -a)
                    stack.pop();
                else if(stack.peek() == -a){
                    stack.pop();
                    a = 0;
                }
                else{
                    a = 0;
                }
            }

            if(a != 0)
                stack.push(a);
        }

        int[] res = new int[stack.size()];
        for(int i=res.length-1;i>=0;i--)
            res[i] = stack.pop();

        return res;
    }
}
