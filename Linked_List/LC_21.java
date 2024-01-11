package TopInterview150.Linked_List;

public class LC_21 {
    // [1,2,4], [1,1,2,4]
    // [0,3,4]   [3,4]
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = list1;
        while(list2 != null){
            if(list1.val <= list2.val){
                ListNode temp = new ListNode(list2.val, list1.next);
                list1.next = temp;
                if(list1.next != null)list1 = list1.next.next;
                else{list1 = null;}
                list2 = list2.next;
            }
            else{
                ListNode temp = new ListNode(list1.val, list1.next);
                list1.val = list2.val;
                list1.next = temp;
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        return head;
    }
}
