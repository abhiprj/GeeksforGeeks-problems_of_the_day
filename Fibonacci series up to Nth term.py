class Solution:
    def series(self, n):
        if n == 0:
            return [0]
        if n == 1:
            return [0, 1]
        ans = [0, 1]
        for i in range(2, n+1):
            ans.append((ans[i-1] + ans[i-2]) % (10**9 + 7)) 
        return ans
            
