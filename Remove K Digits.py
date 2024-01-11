class Solution:

    def removeKdigits(self, S, K):
        s = []
        for d in S:
            while K > 0 and s and s[-1] > d:
                s.pop()
                K -= 1
            s.append(d)
        while K > 0:
            s.pop()
            K -= 1
        result = ''.join(s).lstrip('0')
        return result if result else '0'
