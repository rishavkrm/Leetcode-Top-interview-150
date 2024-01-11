class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
def deleteDuplicates(head: [ListNode]) -> [ListNode]:

        curr = head
        prev = None
        while(curr):
            if curr.next and curr.val == curr.next.val:
                a = curr.val
                while(curr and curr.val == a):
                    curr = curr.next
                if prev:prev.next = curr
                else:head = curr
            else:
                prev = curr
                curr = curr.next
        return head