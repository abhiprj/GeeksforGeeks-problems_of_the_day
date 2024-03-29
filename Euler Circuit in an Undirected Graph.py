class Solution:
    def isEularCircuitExist(self, v, adj):
        return all([len(a) % 2 == 0 for a in adj])
