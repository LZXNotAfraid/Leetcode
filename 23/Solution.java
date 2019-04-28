/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if((l1 == null) &&(l2 == null))
            return null;
        if((l1 == null)&&(l2 != null)){
                return l2;
            }else if((l2 == null)&&(l1 != null)){
                return l1;
            }
        ListNode head;
        ListNode cur;
        if(l1.val > l2.val){
            head = l2;
            cur = l2;
            l2 = l2.next;
        }else{
            head = l1;
            cur = l1;
            l1 = l1.next;
        }
        while(true){
            if((l1 == null)&&(l2 != null)){
                cur.next = l2;
                return head;
            }else if((l2 == null)&&(l1 != null)){
                cur.next = l1;
                return head;
            }else{
                if(l1.val < l2.val){
                    cur.next = l1;
                    cur = cur.next;
                    l1 = l1.next;
                    System.out.println("l1 shortened");
                }else{
                    cur.next = l2;
                    cur = cur.next;
                    l2 = l2.next;
                    System.out.println("l2 shortened");
                }
                continue;
            }
            
        }
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        int cur = lists.length;
        //System.out.print(half);
        if(cur == 0)
            return null;
        while(cur > 1){
            for(int i = 0 ; i < cur / 2 ; i ++){
                lists[i] = mergeTwoLists(lists[i], lists[cur - 1 - i]);
            }
            cur = cur - cur / 2;
        }
        return lists[0];
    }
    
}