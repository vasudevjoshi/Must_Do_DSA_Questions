package Linked_list_Standard_Questions;

public class ReverseLinkedlist {
	/*Iterative Approach : */
	public static ListNode reverse(ListNode head) {
		 ListNode cur = head;
	        ListNode prev = null;
	        ListNode Next = null;
	        while(cur!=null){
	            Next = cur.next;
	            cur.next = prev;
	            prev = cur;
	            cur = Next;
	        }
	        return prev;
	        /*
	         * Recursive Approach: */
	        {
	        	public static ListNode reverse(ListNode head) {
	        		if(head == null || head.next == null ) return hea
	        		ListNode a = head.next;
	        		ListNode newhead = reverse(a);
	        		a.next =head;
	        		head.next = null;
	        		return newhead;
	        	}
	}

