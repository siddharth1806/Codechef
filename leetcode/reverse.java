/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
     
if(null==head || null==head.next){
            return head;
        }
        ListNode cur=head.next;
        head.next=null;

        ListNode prev=head;
        while(true){
            ListNode current=cur.next;
            cur.next=prev;
            if(current==null){
                return cur;
            }
            prev=cur;
            cur=current;
            
        }
    }
}
