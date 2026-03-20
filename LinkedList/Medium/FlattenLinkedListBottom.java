/**
 * Problem Name: Flatten Linked List (Bottom Pointer)
 * Difficulty: Medium
 *
 * Problem Statement:
 * Flatten linked list with bottom pointers.
 *
 * Approach:
 * Merge lists similar to merge sort.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

class Node39 {
    int val;
    Node39 next, bottom;
    Node39(int val){ this.val = val; }
}

public class FlattenLinkedListBottom {

    public static Node39 merge(Node39 a, Node39 b){

        Node39 temp = new Node39(0);
        Node39 res = temp;

        while(a != null && b != null){
            if(a.val < b.val){
                temp.bottom = a;
                a = a.bottom;
            } else {
                temp.bottom = b;
                b = b.bottom;
            }
            temp = temp.bottom;
        }

        temp.bottom = (a != null) ? a : b;

        return res.bottom;
    }

    public static Node39 flatten(Node39 root){

        if(root == null || root.next == null)
            return root;

        root.next = flatten(root.next);

        return merge(root, root.next);
    }
}
