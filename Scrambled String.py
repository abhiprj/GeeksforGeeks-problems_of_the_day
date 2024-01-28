from functools import lru_cache
class Solution:
    
    @lru_cache(None)
    def isScramble(self, S1: str, S2: str):
        ##code here
        if S1 == S2: return True
        if sorted(S1) != sorted(S2): return False
        
        for i in range(1, len(S1)):
            if (self.isScramble(S1[:i], S2[:i]) and self.isScramble(S1[i:], S2[i:])) or (self.isScramble(S1[:i], S2[-i:]) and self.isScramble(S1[i:], S2[:-i])):
                return True
        return False