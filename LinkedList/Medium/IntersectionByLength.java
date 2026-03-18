/**
 * Problem Name: Intersection of Two Linked Lists (Length Method)
 * Difficulty: Medium
 *
 * Problem Statement:
 * Find intersection node using length difference method.
 *
 * Pseudocode:
 * 1. Find lengths of both lists
 * 2. Align pointers
 * 3. Traverse together
 *
 * Approach:
 * Align both lists before traversal.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode28 {
    int val;
    ListNode28 next;
    ListNode28(int val){ this.val = val; }
}

public class IntersectionByLength {

    public static ListNode28 getIntersection(ListNode28 a, ListNode28 b){

        int len1 = length(a);
        int len2 = length(b);

        while(len1 > len2){
            a = a.next;
            len1--;
        }

        while(len2 > len1){
            b = b.next;
            len2--;
        }

        while(a != null && b != null){
            if(a == b) return a;
            a = a.next;
            b = b.next;
        }

        return null;
    }

    private static int length(ListNode28 head){

        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
