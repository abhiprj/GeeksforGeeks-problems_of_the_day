class Solution:
    def subLinkedList(self, l1, l2):
        
        def reverse_with_length(node):
            prev, length = None, 0
            while node:
                prev, node.next, node = node, prev, node.next
                length += 1
            return prev, length
        
        def remove_leading_zeroes(node):
            while node.next and node.data == 0:
                node = node.next
            return node
        
        l1, length1 = reverse_with_length(remove_leading_zeroes(l1))
        l2, length2 = reverse_with_length(remove_leading_zeroes(l2))
        # Make sure l1 is the larger number
        if length1 < length2:
            l1, l2 = l2, l1
        elif length1 == length2:
            l1, _ = reverse_with_length(l1)
            l2, _ = reverse_with_length(l2)
            while l1 and l1.data == l2.data:
                l1, l2 = l1.next, l2.next
            if l1 is None:
                return Node(0)
            if l1.data < l2.data:
                l1, l2 = l2, l1
            l1, _ = reverse_with_length(l1)
            l2, _ = reverse_with_length(l2)
        # Perform the subtraction on the reversed lists
        head, carry = None, 0
        while l1:
            # l2 might be shorter than l1
            l2_data = 0
            if l2:
                l2_data, l2 = l2.data, l2.next
            val = l1.data - l2_data - carry
            if val < 0:
                carry = 1
                val += 10
            else:
                carry = 0
            node = Node(val)
            node.next, head = head, node
            l1 = l1.next
        if head.data == 0:
            head = head.next
        return head