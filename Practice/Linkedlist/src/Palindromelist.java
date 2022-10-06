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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev ; //new head of list
    }
    public ListNode findMiddle(ListNode head)
    {
        //2 steps
        ListNode hare=head;
        ListNode tur=head;
        while(hare.next!=null && hare.next.next!=null)
        {
            //hare jumps 2 steps
            hare=hare.next.next;
            //turtlr=e jumps 1 step
            tur=tur.next;
        }
        return tur; //first half : last node i.e middle
    }
    public boolean isPalindrome(ListNode head) {
        //empty or only one element is itself a palindrome
        if(head==null || head.next==null)
        {
            //return from here
            return true;
        }
        //1. find middle of list
        ListNode middle=findMiddle(head); //half of 1st end
        //2. reverse from second end start
        ListNode secondhalfstart=reverse(middle.next);
        //3.compare
        ListNode firsthalfstart=head;
        while(secondhalfstart!=null)
        {
            //secodn half not travelled
            if(firsthalfstart.val!=secondhalfstart.val)
            {
                return false;
            }
            firsthalfstart=firsthalfstart.next;
            secondhalfstart=secondhalfstart.next;
            
                
        }
        return true;
    }
}
public class Palindromelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
