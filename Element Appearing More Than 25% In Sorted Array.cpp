class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        vector<int> options = {arr[arr.size()/4], arr[arr.size()/2], arr[3*arr.size()/4]};
        for(auto c:options){
            auto s = lower_bound(arr.begin(), arr.end(), c);
            auto e = upper_bound(arr.begin(), arr.end(), c);
            if(e-s > arr.size()/4) return c;
        }
        return -1;
    }
};