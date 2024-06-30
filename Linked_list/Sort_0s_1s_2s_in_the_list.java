package Linked_list_Standard_Questions;

/*GeeksforGeeks Question: https://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/*/
import Interfaces.node;

public class Sort_0s_1s_2s_in_the_list {
	public static void main(String[] args) {
		node listof0s = new node(-1); // create a dummy node which is the head of the list which has only 1s
		node listof1s = new node(-1); //create a dummy node which is the head of the list which has only 0s
		node listof2s = new node(-1); // create a dummy node which is the head of the list which has only 0s 
		node temp0= listof0s;
		node temp1 = listof1s;
		node temp2 = listof2s;
		node temp = head;
		while(temp!=null) {
			if(temp.data == 0) {
				temp0.next = temp;
				temp0 = temp0.next;
			}
			else if(temp.data == 1) {
				temp1.next = temp;
				temp1 = temp1.next;
			}
			else {
				temp2.next = temp;
				temp2 = temp2.next;
			}
			temp = temp.next;
		}
		temp0.next = listof1s.next;
		temp1.next=listof2s.next;
		temp2.next = null;
	}
}
