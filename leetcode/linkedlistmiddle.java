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
    public ListNode middleNode(ListNode head) {
     ListNode first=head;
        ListNode sec=head;
        
        while(sec!=null && sec.next!=null){
            first=first.next;
            sec=sec.next.next;
        }
        
        return first;
        
        
        
    }
    /*  public int length ()
  {
    if (head == null)
      {
	return 0;
      }
    int count = 0;
    ListNode cur = head;
    while (cur != null)
      {
	count++;
	cur = cur.next;
      }
    return count/2;

  }*/
}
