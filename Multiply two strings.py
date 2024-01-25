class Solution:
    def multiplyStrings(self,s1,s2):
        
        def b(s1):
            n1 = 0
            flag = False
            for i in range(len(s1)):
                if i == 0 and s1[i] in["-", "+"]:
                    if s1[i] == "-":
                        flag = True
                    continue
                n1 += int(s1[i]) * (10**(len(s1)-i-1))
                
            return n1 * -1 if flag else n1
            
        temp =b(s1)
        return 0 if temp==0 else temp*b(s2)