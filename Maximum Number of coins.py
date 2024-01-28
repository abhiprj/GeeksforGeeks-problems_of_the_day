
class Solution():
    def maxCoins(self, N, a):
        # Initialize a 2D array for dynamic programming
        dp = [[0 for i in range(N + 2)] for j in range(N + 2)]

        # Insert 1 at the beginning and end of the 'a' array
        a.insert(0, 1)
        a.append(1)

        # Iterate through the subarrays of increasing lengths
        for i in range(0, N - 1 + 1):
            for start in range(1, N - i + 1):
                end = start + i
                res = 0

                # Iterate through the possible balloon burst positions within the subarray
                for k in range(start, end + 1):
                    # Calculate the maximum result for the current subarray
                    temp = dp[start][k - 1] + a[start - 1] * a[k] * a[end + 1] + dp[k + 1][end]
                    res = max(res, temp)

                # Update the dynamic programming array with the maximum result
                dp[start][end] = res

        # Return the maximum result for the entire array
        return dp[1][N]