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
    public boolean isPalindrome(ListNode head) {
    ListNode slowptr=head;
        ListNode fastptr=head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            
        }
        ListNode rev=reverse(slowptr);
        while(head!=null && rev!=null){
            if(rev.val==head.val){
                rev=rev.next;
                head=head.next;
                
            }
            else{
                return false;
            }
        }
    
        return true;
        
        
    }
    public ListNode reverse(ListNode head){
            ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}
