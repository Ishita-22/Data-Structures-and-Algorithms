/**
 * Problem Name: Flatten Multi-Level Linked List (Recursive)
 * Difficulty: Hard
 *
 * Problem Statement:
 * Flatten a multi-level linked list recursively.
 *
 * Approach:
 * DFS flattening.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Node49 {
    int val;
    Node49 next, child;
    Node49(int val){ this.val = val; }
}

public class FlattenMultiLevelRecursive {

    public static Node49 flatten(Node49 head){

        if(head == null) return null;

        flattenDFS(head);
        return head;
    }

    private static Node49 flattenDFS(Node49 node){

        Node49 curr = node, last = null;

        while(curr != null){

            Node49 next = curr.next;

            if(curr.child != null){

                Node49 childTail = flattenDFS(curr.child);

                curr.next = curr.child;

                Node49 temp = curr.child;
                temp.child = null;

                while(temp.next != null)
                    temp = temp.next;

                temp.next = next;

                last = temp;

            } else {
                last = curr;
            }

            curr = next;
        }

        return last;
    }
}
