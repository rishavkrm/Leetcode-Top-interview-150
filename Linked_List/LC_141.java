package TopInterview150.Linked_List;

public class LC_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while (slowPointer != null && fastPointer != null) {
            if (slowPointer == fastPointer && slowPointer != null) {
                return true;
            }
            slowPointer = slowPointer.next;
            if (fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
            } else {
                fastPointer = null;
            }

        }
        return false;
    }
}
