package Linked_list_Standard_Questions;

public class Palindrome_linkedlist {
	
	/*Function to reverse the list*/
	public static reverselist(ListNode head) {
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
	}
	
	
	/*Brute force: To create a deep copy of the given list  and reverse the copy of the list and then compare the each node
	 * value, if any node value is not same then given list is not palindrome*/
	public static isboolean isPalindrome_Bruteforce(ListNode head) {
		ListNode duplicate_list = new ListNode(head.val);
		ListNode tempNode_Original_list = head.next;
		ListNode tempNode_Duplicate_list = duplicate_list;
		while(tempNode_Original_list!=null) {
			ListNode temp = new ListNode(tempNode_Original_list);
			tempNode_Duplicate_list.next = temp;
			tempNode_Duplicate_list = tempNode_Duplicate_list.next;
			tempNode_Original_list = tempNode_Original_list.next;
		}
		tempNode_Duplicate_list = reverselist(duplicate_list);
		tempNode_Original_list = head;
		while(tempNode_Original_list!=null) {
			if(tempNode_Original_list.data != tempNode_Duplicate_list.data) return false;
			tempNode_Original_list =tempNode_Original_list.next;
			tempNode_Duplicate_list = tempNode_Duplicate_list.next;
		}
		return true;
	}
	/*Optimal Solution: Consider two pointers: Slow and fast pointers
	 * Find the right middle of the list using slow and fast pointers
	 * Pass the right middle to the reverse function and reverse all the elements after the slow
	 * Now initalise the temp to the head and temp2 to the reversed part of the list
	 * start comparing the values of the temp1 and temp2 nodes, if not same return false else true
	 * using while loop with condition that temp2!= null
	 **/
	public static isboolean isPalindrome(ListNode head) {
		if(head.next == null ) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode Newhead = reverse(slow);
        ListNode temp1 = head;
        ListNode temp2 = Newhead;
        while(temp2!=null){
            if(temp1.val!=temp2.val)
                return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
	}
}
