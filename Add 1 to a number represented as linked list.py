'''

class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None
'''

class Solution:
    def reverse(self,head):
        prev=None
        curr=head
        while curr:
            next=curr.next
            curr.next=prev
            prev=curr
            curr=next
        return prev
        
    def addOne(self, head):
        curr=head
        n=0
        while curr:
            n=curr.data+n*10
            curr=curr.next
        n=n+1
        newhead=Node(n%10)
        n=n//10
        temp=newhead
        while n:
            newhead.next=Node(n%10)
            newhead=newhead.next
            n=n//10
        newhead=self.reverse(temp)
        return newhead
