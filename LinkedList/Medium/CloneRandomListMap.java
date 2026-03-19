/**
 * Problem Name: Clone Linked List with Random Pointer (HashMap)
 * Difficulty: Medium
 *
 * Problem Statement:
 * Deep copy list using HashMap.
 *
 * Approach:
 * Store mapping between original and copied nodes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class Node32 {
    int val;
    Node32 next, random;
    Node32(int val){ this.val = val; }
}

public class CloneRandomListMap {

    public static Node32 copyRandomList(Node32 head){

        Map<Node32, Node32> map = new HashMap<>();

        Node32 curr = head;

        while(curr != null){
            map.put(curr, new Node32(curr.val));
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}
