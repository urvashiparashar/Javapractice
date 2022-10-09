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
        if(head==null || head.next==null)
        {
            return head; //already reversed
            
        }
        ListNode temp=head, p=null,q=null;
        while(temp!=null)
        {
            q=temp.next;
            temp.next=p;
            p=temp;
            temp=q;
        }
        return head=p;
    }
}
public class Reverse_list_iterative {

}
