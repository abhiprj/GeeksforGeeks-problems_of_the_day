class Solution{
    public:
    int lenOfLongSubarr(int A[],  int N, int K) 
    {
        unordered_map<int, int> map;
        
        int sum = 0, res = 0;
        for (int i = 0; i < N; ++i) {
            sum += A[i];
            if (map.find(sum) == map.end()) {
                map[sum] = i;
            }
            
            if (sum == K) {
                res = max(res, i + 1);
            } else if (map.find(sum - K) != map.end()) {
                res = max(res, i - map[sum - K]);
            }
        }
        
        return res;
    } 

};