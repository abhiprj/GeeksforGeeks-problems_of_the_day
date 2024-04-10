
class Solution:
    def findSingle(self, n, arr):
        # code here
        ans = 0
        for i in range(n):
            ans ^= arr[i]
        return ans