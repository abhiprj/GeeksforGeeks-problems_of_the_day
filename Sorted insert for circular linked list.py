class Solution:
    def sortedInsert(self, head, data):
        newnode=Node(data)
        if not head:
            newnode.next=newnode
            return newnode
        curr=head
        if data<head.data:
            while curr.next!=head:
                curr=curr.next
            curr.next=newnode
            newnode.next=head
            return newnode
            
        curr=head
        while curr.next!=head and curr.next.data<data:
            curr=curr.next
        newnode.next=curr.next
        curr.next=newnode
        return head