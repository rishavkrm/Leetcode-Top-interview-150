class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
def rotateRight(self, head: [ListNode], k: int) -> [ListNode]:
        n = 0
        curr = head
        while(curr):
            curr = curr.next
            n += 1
        if(n == 0):
            return None
        k = k%n
        if(k == 0):return head
        curr = head
        prev = None
        for i in range(n-k):
            prev = curr
            curr = curr.next
        prev1 = None
        curr1 = curr
        prev.next = None
        while(curr):
            prev1 = curr
            curr= curr.next
        if prev1 : prev1.next = head

        head = curr1
        return head