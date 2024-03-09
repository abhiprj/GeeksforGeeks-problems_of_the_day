class Solution:
    def nthCharacter(self, s, r, n):
        t = ""
        for _ in range(r):
            for i in range(len(s)):
                if s[i] == "1":
                    t += "10"
                else:
                    t += "01"
                if i > n:
                    break
            s = t[:]
            t = ""
        return s[n]