/**
 * Problem Name: Maximum XOR of Two Numbers
 * Difficulty: Hard
 *
 * Problem Statement:
 * Find maximum XOR of two numbers.
 *
 * Approach:
 * Use Trie for bit manipulation.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class TrieNode {
    TrieNode[] children=new TrieNode[2];
}

public class MaximumXOR {

    public static int findMaximumXOR(int[] nums) {

        TrieNode root=new TrieNode();

        for(int num:nums) {
            TrieNode node=root;
            for(int i=31;i>=0;i--) {
                int bit=(num>>i)&1;
                if(node.children[bit]==null)
                    node.children[bit]=new TrieNode();
                node=node.children[bit];
            }
        }

        int max=0;

        for(int num:nums) {
            TrieNode node=root;
            int curr=0;

            for(int i=31;i>=0;i--) {
                int bit=(num>>i)&1;
                if(node.children[1-bit]!=null) {
                    curr|=(1<<i);
                    node=node.children[1-bit];
                } else
                    node=node.children[bit];
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}
