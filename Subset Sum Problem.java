class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        Boolean dp[][] = new Boolean[N+1][sum+1];
        for(int i=0; i<N+1; i++){
            dp[i][0] = true;
        }
        for(int j=1; j<sum+1; j++){
            dp[0][j] = false;
        }
        for(int i=1; i<N+1; i++){
            for(int j=1; j<sum+1; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][sum];
    }
}