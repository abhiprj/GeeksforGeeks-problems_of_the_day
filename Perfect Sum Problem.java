class Solution{
    public static int mod = 1000000007;
    public static int f(int arr[],int n,int sum,int dp[][]){
        if(n==0){
            if(sum==0) return 1;
            return 0;
        }
        if(dp[n][sum]!=-1) return dp[n][sum];
        if(sum>=arr[n-1]){
            return dp[n][sum] = (f(arr,n-1,sum-arr[n-1],dp)%mod + f(arr,n-1,sum,dp)%mod)%mod;
        }
        return dp[n][sum] = f(arr,n-1,sum,dp)%mod;
    }

	public int perfectSum(int arr[],int n, int sum) { 
	    int dp[][] = new int[n+1][sum+1];
	    for(int row[]:dp) Arrays.fill(row,-1);
	    return f(arr,n,sum,dp)%mod;
	} 
}


