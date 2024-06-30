package Linked_list_Standard_Questions;

public class Linkedlistcycle {
	public static void main(String[] args) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null) {
			slow =slow.next;
			fast = fast.next.next;
			if(slow == fast) { 
				System.out.println("the cycle does exist");
				break;
			}
			}
		}
	}

