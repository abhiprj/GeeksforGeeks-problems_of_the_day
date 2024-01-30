class Solution {
    static int maxProfit(int K, int N, int A[]) {
        int index = 0, count = 0;
        int[][][] dp = new int[N][2][K];
        for(int i=0; i<N; i++) {
            for(int j=0; j<2; j++) {
                for(int k=0; k<K; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return dfs(dp,A, K, N, index, count, 1);
    }
    static int dfs(int[][][] dp, int A[], int k, int n, int index, int count, int buy) {
        if(count == k || index == n) return 0;
        if(dp[index][buy][count] != -1) return dp[index][buy][count];
        int profit = 0;
        if(buy == 1) {
            profit = Math.max(-A[index] + dfs(dp,A, k, n, index+1, count, 0), 
                             dfs(dp,A, k, n, index+1, count, 1));
        } else {
            profit = Math.max(A[index] + dfs(dp,A, k, n, index+1, count+1, 1), 
                             dfs(dp, A, k, n, index+1, count, 0));
        }
        dp[index][buy][count] = profit;
        return dp[index][buy][count];
    }
}
