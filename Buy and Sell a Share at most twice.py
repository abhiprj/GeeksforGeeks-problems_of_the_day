from typing import List


class Solution:
    def maxProfit(self, n : int, price : List[int]) -> int:
        # code here
        left=[0]*n
        mn=price[0]
        for i in range(1,n):
            cur=price[i]
            mn=min(mn,cur)
            left[i]=max(left[i-1],cur-mn)
        
        mx=price[-1]
        result=max(left)
        for i in range(n-2,0,-1):
            cur=price[i]
            mx=max(mx,cur)
            result=max(result,left[i-1]+mx-cur)
        return result
        # code here