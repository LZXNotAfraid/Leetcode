/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode t = new ListNode(1);
        t.next = head;
        twoSwap(head, t);
        return t.next;
    }
    
    public void twoSwap(ListNode head, ListNode previous){
        if(head != null){
            ListNode tail = head.next;
            if(tail == null)
                return;
            else{ListNode tailnext = tail.next;
                if(tail != null){
                    previous.next = tail;
                    tail.next = head;
                    head.next = tailnext;
                    twoSwap(tailnext, head);
                }
            }
        }
    }
}
