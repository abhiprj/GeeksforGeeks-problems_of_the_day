class Solution:
    def DivisibleByEight(self,s):
        return 1 if int(s.rjust(3, '0')[-3:])%8 == 0 else -1