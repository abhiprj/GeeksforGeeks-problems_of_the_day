class Solution

{
	public:
		set<string> getlcs(vector<vector<int>> &dp, string s, string t, int posi, int posj){
        string ans = "";
        while(posi > 0 && posj > 0){
            if(s[posi - 1] == t[posj - 1])
            {
                ans += s[posi - 1];
                posi--; posj--;
            } else{
                if(dp[posi][posj - 1] > dp[posi - 1][posj])
                    posj--;
                else if(dp[posi][posj - 1] < dp[posi - 1][posj])
                    posi--;
                else{
                    set<string> tmp1 = getlcs(dp, s, t, posi - 1, posj);
                    set<string> tmp2 = getlcs(dp, s, t, posi, posj - 1);
                    set<string> newans;
                    
                    for(string y1: tmp1){
                        newans.insert(ans + y1);
                    }
                    for(string y2: tmp2){
                        newans.insert(ans + y2);
                    }
                    return newans;
                }
            }
        }
        set<string> aa;
        aa.insert(ans);
        return aa;
    }
	public:
	vector<string> all_longest_common_subsequences(string s, string t)
	{
	    int n = s.length(), m = t.length();
	    vector<vector<set<string>>> dp(n+1, vector<set<string>>(m+1));
	    set<string> emptyset;
	    emptyset.insert("");
	    for(int i=0; i<n+1; i++){
	        dp[i][0] = emptyset;
	    }
	    for(int i=0; i<m+1; i++){
	        dp[0][i] = emptyset;
	    }
        for(int posi=1; posi<=n; posi++){
            for(int posj=1; posj<=m; posj++){
                if(s[posi-1] == t[posj-1]){
                    for(string x: dp[posi-1][posj-1])
                        dp[posi][posj].insert(x + s[posi-1]);
                } else{
                    int i_j_minus_1 = dp[posi][posj-1].begin()->length();
                    int i_minus_1_j = dp[posi-1][posj].begin()->length();
                    if(i_j_minus_1 > i_minus_1_j)
                        dp[posi][posj] = dp[posi][posj-1];
                    else if(i_j_minus_1 < i_minus_1_j)
                        dp[posi][posj] = dp[posi-1][posj];
                    else{
                        for(string x: dp[posi][posj-1])
                            dp[posi][posj].insert(x);
                        for(string x: dp[posi-1][posj])
                            dp[posi][posj].insert(x);
                    }
                }
            }
        }
        int lcslen = dp[n][m].begin()->length(); 
        if(lcslen == 0)
            return {""};
        set<string> lcsstrings;
        for(int posi=1; posi<=n; posi++){
            for(int posj=1; posj<=m; posj++){
                if(dp[posi][posj].begin()->length() == lcslen){
                    for(string x: dp[posi][posj]){
                        lcsstrings.insert(x);
                    }
                }
            }
        }
        vector<string> ans(lcsstrings.begin(), lcsstrings.end());
        return ans;
	}
};