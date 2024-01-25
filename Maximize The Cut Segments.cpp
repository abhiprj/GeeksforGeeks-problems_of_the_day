class Solution
{
    public:
    //Function to find the maximum number of cuts.
    int maximizeTheCuts(int n, int x, int y, int z)
    {
        //Your code here
        vector<int>dp(n+1,INT_MIN);
        int arr[]={x,y,z};
        
        int ans=solve(n,arr,dp);
        
        return ans<0? 0:ans;
    }
    
    int solve(int n,int arr[],vector<int>&dp){
        if(n<0) return INT_MIN;
        
        if(n==0) return 0;
        
        if(dp[n]!=INT_MIN) return dp[n];
        
        
        
        for(int i=0;i<3;i++){
            if(n-arr[i]>=0){
                dp[n]=max(dp[n],1+solve(n-arr[i],arr,dp));
            }
        }
        
        
        
        return dp[n];
        
    }
};