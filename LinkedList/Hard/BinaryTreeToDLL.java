/**
 * Problem Name: Convert Binary Tree to Doubly Linked List
 * Difficulty: Hard
 *
 * Problem Statement:
 * Convert binary tree to doubly linked list in inorder.
 *
 * Approach:
 * Inorder traversal linking nodes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class TreeNode50 {
    int val;
    TreeNode50 left, right;
    TreeNode50(int val){ this.val = val; }
}

public class BinaryTreeToDLL {

    static TreeNode50 prev = null, head = null;

    public static TreeNode50 convert(TreeNode50 root){

        inorder(root);
        return head;
    }

    private static void inorder(TreeNode50 node){

        if(node == null) return;

        inorder(node.left);

        if(prev == null)
            head = node;
        else{
            prev.right = node;
            node.left = prev;
        }

        prev = node;

        inorder(node.right);
    }
}
