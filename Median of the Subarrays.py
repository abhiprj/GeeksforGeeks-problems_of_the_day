class Solution:
    def countSubarray(self, n, nums, k): 
        def rohit(n,nums,k):
            d={0:1}
            ans=0
            cur=0 
            sum=0
            n=len(nums)
            for i in range(n):
                if nums[i]<k:
                    sum-=1 
                    if sum in d:
                        cur-=d[sum]
                else:
                    if sum in d:
                        cur+=d[sum]
                    sum+=1 
                ans+=cur 
                if sum in d:
                    d[sum]+=1 
                else:
                    d[sum]=1 
            return ans  
                    
        return rohit(n,nums,k)-rohit(n,nums,k+1) 