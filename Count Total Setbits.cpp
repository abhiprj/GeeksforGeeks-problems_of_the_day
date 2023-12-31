class Solution {
  public:
    long long countBits(long long N) {
        // code here
        if(N == 1) return 1;
        long long t = log2(N),out = 0,sets;
        for(int i = t; i>=0;--i){
            sets = N/(1<<i);
            out += sets/2 * (1<<i);
            out += (sets%2)?(N-(sets * (1<<i))+1): 0;
            // cout<<out<<endl;
        }
        return out;
    }
};