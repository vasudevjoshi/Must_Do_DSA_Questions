package Linked_list_Standard_Questions;

public class Max_Twin_Sum_of_the_list {
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
	    public int pairSum(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode temp = head;
	        while(fast.next!=null && fast.next.next!=null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        int sum = 0;
	        ListNode HeadfromHalf = reverseList(slow.next);
	        slow.next = null;
	        ListNode temp2 = HeadfromHalf;
	        while(temp!=null){
	            sum = Math.max(sum, temp.val + temp2.val);
	            temp = temp.next;
	            temp2 = temp2.next;
	        }
	        return sum;
	    }
}
