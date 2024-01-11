class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def partition(head: [ListNode], x: int) -> [ListNode]:
        if not head: return head
        head2 = ListNode(None)
        curr2 = head2
        curr = head
        while(curr):
            if(curr.val < x):
                curr2.val = curr.val
                curr2.next = ListNode(None)
                curr2 = curr2.next
            curr = curr.next
        curr = head
        while(curr):
            if(curr.val >= x):
                curr2.val = curr.val
                curr2.next = ListNode(None)
                curr2 = curr2.next
            curr = curr.next
        temp2 = head2
        while(temp2):
            if(temp2.next and temp2.next.val == None):
                temp2.next = None
            temp2 = temp2.next
        return head2