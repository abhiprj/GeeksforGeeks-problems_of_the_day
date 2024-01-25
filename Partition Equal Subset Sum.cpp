class Solution{
public:
    vector<vector<int>> dp;
    int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += arr[i];
        }
        dp.resize(N+1, vector<int> (sum/2 + 1, -1));
        if (sum&1) return 0;
        else {
            for (int i=0; i<sum/2+1; i++) {
                dp[0][i] = false;
            }
            for (int i=0; i<N+1; i++) {
                dp[i][0] = true;
            }
            for (int i=1; i<N+1; i++) {
                for (int j=1; j<sum/2+1; j++) {
                    if (arr[i-1] <= j) {
                        dp[i][j] = (dp[i-1][j-arr[i-1]] || dp[i-1][j]);
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            return dp[N][sum/2];
        }
    }
};