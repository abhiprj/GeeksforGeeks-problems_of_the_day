class Solution:
    def absolute_diff(self,root):
        self.prev = None
        self.min_diff = float('inf')
        
        def inorder(node):
            if node is None:
                return
            inorder(node.left)
            if self.prev is not None:
                self.min_diff = min(self.min_diff, node.data - self.prev.data)
            self.prev = node
            inorder(node.right)
        
        inorder(root)
        return self.min_diff
