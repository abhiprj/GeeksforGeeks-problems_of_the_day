class Solution{
public:
    int maxEqualSum(int N1, int N2, int N3, vector<int> &S1, vector<int> &S2, vector<int> &S3){
        unordered_map<int, int> mp;
        int s = 0;
        for(int i = N1 - 1; i >= 0; --i){
            s += S1[i];
            ++mp[s];
        }
        s = 0;
        for(int i = N2 - 1; i >= 0; --i){
            s += S2[i];
            if(mp.find(s) != mp.end())
                ++mp[s];
        }
        s = 0;
        for(int i = N3 - 1; i >= 0; --i){
            s += S3[i];
            if(mp.find(s) != mp.end())
                ++mp[s];
        }
        int out = 0;
        for(auto i: mp){
            if(i.second == 3){
                out = max(out, i.first);
            }
        }
        return out;
    }
};