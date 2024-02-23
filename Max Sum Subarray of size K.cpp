



class Solution {   
public:
    long maximumSumSubarray(int K, vector<int> &Arr , int N){
        long out = 0;
        long sum = 0;
        for(int i = 0; i < N ; ++i){
            sum += Arr[i];
            if(i >= K)
                sum -= Arr[i - K];
            
            out = max(out, sum);
        }
        return out;
    }
};
