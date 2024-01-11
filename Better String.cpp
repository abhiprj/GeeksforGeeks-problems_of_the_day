class Solution {
  public:
    string betterString(string str1, string str2) 
    {
        int a = countSubSeq(str1);
        int b = countSubSeq(str2);
        if(a == b)
            return str1;
        if(a>b)
        {
            return str1;
        }
        else
            return str2;
        // code here
    }
    int countSubSeq(string &str)
    {
        unordered_map<char,int> mp;
        int n = str.size();
        int dp[n+1];
        dp[0] = 1;
        for(int i = 1; i <=n; i++)
        {
            dp[i] = 2 * dp[i-1];
            if(mp.find(str[i-1]) != mp.end())
            {
                dp[i] = dp[i] - dp[mp[str[i-1]]];
            }
            mp[str[i-1]] = i-1;
        }
        return dp[n];
    }
};