class Solution:
    #Function to return the level order traversal of a tree.
    def levelOrder(self,root):
        # Code here
        result=[]
        result.append(root)
        i=0
        while i<len(result):
            cur=result[i]
            if cur.left:
                result.append(cur.left)
            if cur.right:
                result.append(cur.right)
            result[i]=result[i].data
            i+=1
        return result