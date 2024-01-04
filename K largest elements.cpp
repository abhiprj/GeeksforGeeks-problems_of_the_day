class Solution{
public:
    vector<int> kLargest(int arr[], int n, int k) {
        priority_queue<int, vector<int>, greater<int>> pq;
        vector<int> out;
            
        for(int i = 0; i < n; ++i){
            pq.push(arr[i]);
            if(pq.size() > k)
                pq.pop();
        }
            
        while(!pq.empty()){
            out.push_back(pq.top());
            pq.pop();
        }
            
        reverse(out.begin(), out.end());
            
        return out;
    }
};