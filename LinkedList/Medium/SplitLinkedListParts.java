/**
 * Problem Name: Split Linked List into Parts
 * Difficulty: Medium
 *
 * Problem Statement:
 * Split linked list into k parts as evenly as possible.
 *
 * Pseudocode:
 * 1. Count total nodes
 * 2. Each part size = n/k
 * 3. First extra nodes get +1
 *
 * Approach:
 * Distribute nodes evenly across k parts.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode30 {
    int val;
    ListNode30 next;
    ListNode30(int val){ this.val = val; }
}

public class SplitLinkedListParts {

    public static ListNode30[] splitList(ListNode30 head, int k){

        int n = 0;
        ListNode30 curr = head;

        while(curr != null){
            n++;
            curr = curr.next;
        }

        int size = n / k;
        int extra = n % k;

        ListNode30[] result = new ListNode30[k];
        curr = head;

        for(int i = 0; i < k; i++){

            result[i] = curr;
            int partSize = size + (i < extra ? 1 : 0);

            for(int j = 1; j < partSize; j++)
                curr = curr.next;

            if(curr != null){
                ListNode30 temp = curr.next;
                curr.next = null;
                curr = temp;
            }
        }

        return result;
    }
}
