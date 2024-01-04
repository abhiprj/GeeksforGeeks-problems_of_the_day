class Solution {
public:
    void Rearrange(int arr[], int n) {
        vector<int> neq, pos;
        for(int i = 0; i < n; ++i) {
            if(arr[i] < 0) {
                neq.push_back(arr[i]);
            } else {
                pos.push_back(arr[i]);
            }
        }
        int sz = neq.size();
        for(int i = 0; i < sz; ++i)
            arr[i] = neq[i];
        for(int i = sz; i < n; ++i)
            arr[i] = pos[i - sz];
    }
};