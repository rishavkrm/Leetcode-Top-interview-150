class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def removeNthFromEnd(head: [ListNode], n: int) -> [ListNode]:
        len = 0
        curr = head
        while(curr != None):
            curr = curr.next
            len += 1

        curr = head
        prev = ListNode(None)
        if(len == n):
            head = head.next
        for i in range(len-n):
            prev = curr
            curr = curr.next
           
        prev.next = curr.next
        return head