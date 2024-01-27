
class Solution
{
    //Function to count number of ways to reach the nth stair.
    
    int countWays(int n)
    
    {
        int mod = 1000000007;
        int prev1 = 1;
        int prev2 = 1;
        
        for(int i =2;i<=n;i++)
        {
            int curr = (prev1+prev2)%mod;
            prev1 = prev2;
            
            prev2= curr;
        }
        return prev2;
    }
}
    
    /*
    int countWays(int n)
    {
        
      int [] dp = new int[n+1];
      
      for(int i =0;i<n+1;i++)
      {
          dp[i] = -1;
      }
      
      return count(n,dp);
    }
    
    int count(int n, int[] dp)
    {
        if(n == 1 || n ==2 )
        {
            return n;
        }
        
        if(dp[n] != -1)
        {
            return dp[n];
        }
        
       dp[n] = count(n-1,dp)+count(n-2,dp);
       
       return dp[n];
        
    }
}
*/