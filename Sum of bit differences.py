class Solution:
 
 
    def sumBitDifferences(self,arr, n):
        # code here
        a=0
        for i in range(32):
               o=0;z=0
               for j in arr:
                   if j&(1<<i):
                       o+=1
                   else:
                       z+=1
               a+=(o*z)
        return 2*a

