/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int count = 1;
        while(head != null){
            if(count % 2 == 0)
                middle = middle.next;
            count ++;
            head = head.next;
        }
        return middle;
    }
}
