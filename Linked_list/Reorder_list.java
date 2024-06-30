package Linked_list_Standard_Questions;
/*Leetcode 143: https://leetcode.com/problems/reorder-list/description/*/
public class Reorder_list {
	 public ListNode reverseList(ListNode head){
	        ListNode cur = head;
	        ListNode prev = null;
	        ListNode next = null;
	        while(cur!=null){
	            next = cur.next;
	            cur.next = prev;
	            prev = cur;
	            cur = next;
	        }
	        return prev;
	    }
	    public void reorderList(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode temp = head;
	        while(fast.next!=null && fast.next.next!=null){
	            slow = slow.next;
	            fast =fast.next.next;
	        }
	        ListNode head2 = reverseList(slow.next);
	     slow.next = null;

	     ListNode dummy = new ListNode(-1);
	     ListNode tempb = dummy;
	     while(head!=null && head2!=null){
	        tempb.next = head;
	        head = head.next;
	        tempb = tempb.next;
	        tempb.next = head2;
	        head2 = head2.next;
	        tempb = tempb.next;
	     }
	     if(head == null ) tempb.next = head2;
	     else tempb.next = head;
	     head = dummy.next;
	    }
}
