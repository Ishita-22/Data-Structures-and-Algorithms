/**
 * Problem Name: Flatten Multilevel Doubly Linked List
 * Difficulty: Medium
 *
 * Problem Statement:
 * Flatten a multilevel doubly linked list.
 *
 * Pseudocode:
 * 1. Traverse list
 * 2. If child exists, recursively flatten
 * 3. Attach child and reconnect pointers
 *
 * Approach:
 * DFS flattening ensures correct order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Node2 {
    int val;
    Node2 prev, next, child;
}

public class FlattenMultilevelList {

    public static Node2 flatten(Node2 head){
        dfs(head);
        return head;
    }

    private static Node2 dfs(Node2 node){

        Node2 curr = node, last = null;

        while(curr != null){

            Node2 next = curr.next;

            if(curr.child != null){

                Node2 childTail = dfs(curr.child);

                curr.next = curr.child;
                curr.child.prev = curr;

                if(next != null){
                    childTail.next = next;
                    next.prev = childTail;
                }

                curr.child = null;
                last = childTail;

            } else {
                last = curr;
            }

            curr = next;
        }

        return last;
    }
}
