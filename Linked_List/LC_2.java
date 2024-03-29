package TopInterview150.Linked_List;

public class LC_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode head = result;
        while(l1 != null || l2!=null){
            int v1 = 0;
            int v2 = 0;
            if(l1!=null){v1 = l1.val;}
            if(l2!=null){v2 = l2.val;}
            result.val = (v1 + v2 + carry)%10;
            carry = (v1 + v2 + carry)/10;
            if(l1 != null){l1 = l1.next;}
            if(l2 != null){l2 = l2.next;}
            if(l1 != null || l2 != null || carry >0){
                ListNode temp = new ListNode();
                result.next = temp;
                
            }
            result = result.next;
        }
        if(carry>0){
            result.val = carry;
            result = result.next;
        }
        return head;
    }
}
