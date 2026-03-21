/**
 * Problem Name: Clone Linked List with Random Pointer (Recursive)
 * Difficulty: Hard
 *
 * Problem Statement:
 * Deep copy list using recursion.
 *
 * Approach:
 * Use hashmap + recursion to avoid duplication.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class Node44 {
    int val;
    Node44 next, random;
    Node44(int val){ this.val = val; }
}

public class CloneRandomListRecursive {

    private static Map<Node44, Node44> map = new HashMap<>();

    public static Node44 copy(Node44 node){

        if(node == null) return null;

        if(map.containsKey(node))
            return map.get(node);

        Node44 copy = new Node44(node.val);
        map.put(node, copy);

        copy.next = copy(node.next);
        copy.random = copy(node.random);

        return copy;
    }
}
