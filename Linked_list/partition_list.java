 public ListNode partition(ListNode head, int x) {
        ListNode dum1 = new ListNode(-1);
        ListNode dum2 = new ListNode(-1);
        ListNode temp = head;
        ListNode t1 = dum1;
        ListNode t2 = dum2;
        while(temp!=null){
            if(temp.val<x){
                t1.next = temp;
                t1 = t1.next;
            }
            else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        t1.next = dum2.next;
        t2.next = null;
        return dum1.next;
    }
