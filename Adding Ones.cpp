class Solution{
    public:
    void update(int arr[], int n, int updates[], int k){
        vector<int> out(n+1, 0);
        for(int i = 0; i < k; ++i){
            ++out[updates[i]];
        }
        arr[0] = out[1];
        for(int i = 2; i <= n; ++i){
            arr[i-1] = arr[i-2] + out[i];
        }
    }
};




