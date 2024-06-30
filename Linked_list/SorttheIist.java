package Linked_list_Standard_Questions;

public class SorttheIist {
		    public static ListNode sortList(ListNode head) {
		        if (head == null || head.next == null) {
		            return head;
		        }
		        ListNode slow = head;
		        ListNode fast = head.next;
		        while (fast != null && fast.next != null) {
		            slow = slow.next;
		            fast = fast.next.next;
		        }
		        ListNode second = slow.next;
		        slow.next = null;
		        head = sortList(head);
		        second = sortList(second);
		        return merge(head, second);
		    }

		    public static ListNode merge(ListNode first, ListNode second) {
		        ListNode dummy = new ListNode();
		        ListNode current = dummy;
		        while (first != null && second != null) {
		            if (second.val > first.val) {
		                current.next = first;
		                first = first.next;
		            } else {
		                current.next = second;
		                second = second.next;
		            }
		            current = current.next;
		        }
		        if (first == null) {
		            current.next = second;
		        } else {
		            current.next = first;
		        }
		        return dummy.next;
		    }
}
