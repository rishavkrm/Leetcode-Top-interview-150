class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
def reverseBetween(head: [ListNode], left: int, right: int) -> [ListNode]:
        curr = head 
        prev0 = ListNode(None)
        x = 1
        while(x != left):
            prev0 = curr
            curr = curr.next
            x += 1
        prev = ListNode(None)
        curr1 = curr
        while(x != right+1):
            next = curr.next #5 None
            curr.next = prev #None 3
            prev = curr #3 5
            curr = next #5 None
            x += 1
        if left == 1: head = prev
        else: prev0.next = prev
        curr1.next = curr
        return head