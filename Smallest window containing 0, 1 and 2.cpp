class Solution {
public:
    int smallestSubstring(string S) {
        vector<int> pos(3, -1);
        int out = INT_MAX;
        
        for(int i = 0; i < S.size(); ++i) {
            pos[S[i] - '0'] = i;
            
            int nin = INT_MAX, nax = 0;
            for(auto it: pos) {
                nin = min(nin, it);
                nax = max(nax, it);
            }    
            
            if(nin != -1)
                out = min(out, nax - nin + 1);
        }
        
        return out == INT_MAX ? -1 : out;
    }
};