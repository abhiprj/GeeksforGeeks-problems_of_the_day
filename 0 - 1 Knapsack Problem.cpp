

class Solution
{
    public:
    //Function to return max value that can be put in knapsack of capacity W.
    int dp[1001][1001]; 
    int solve(int w,vector<int>&v,vector<int>&u,int n,int i){
        if(i>=n)
        return 0; 
        if(w<=0)
        return 0; 
        if(dp[i][w]!=-1)
        return dp[i][w]; 
        if(v[i]<=w)
        return dp[i][w]=max(solve(w-v[i],v,u,n,i+1)+u[i],solve(w,v,u,n,i+1)); 
        else
        return dp[i][w]=solve(w,v,u,n,i+1); 
       // if(w-v[i])
        //take
        // solve(w-u[i],v,u,n,i+1,sum +v[i]); 
        //don't take
        //return dp[i][w]=max(solve(w-v[i],v,u,n,i+1)+u[i],solve(w,v,u,n,i+1)); 
    }
    int knapSack(int w, int wt[], int val[], int n) 
    { 
       // Your code here
       memset(dp,-1,sizeof(dp));
       vector<int>v; 
       vector<int>u;
       for(int i=0;i<n;i++){
           v.push_back(wt[i]); 
       }
       for(int i=0;i<n;i++){
           u.push_back(val[i]); 
       }
       int sum=0; 
    //   solve(w,v,u,n,0,sum); 
       return solve(w,v,u,n,0);
    }
};
