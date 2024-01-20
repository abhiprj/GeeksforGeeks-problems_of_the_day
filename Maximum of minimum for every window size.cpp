class Solution
{
    public:
    //Function to find maximum of minimums of every window size.
    vector <int> maxOfMin(int arr[], int n) {
        stack<pair<int, int>> st;
        vector<int> next_smaller(n, n);
        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[i] < st.top().first) {
                next_smaller[st.top().second] = i;
                st.pop();
            }
    
            st.push({arr[i], i});
        }
    
        while (!st.empty()) st.pop();
    
        vector<int> prev_smaller(n, -1);
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr[i] < st.top().first) {
                prev_smaller[st.top().second] = i;
                st.pop();
            }
    
            st.push({arr[i], i});
        }
        vector<int> minval(n);
        for (int i = 0; i < n; i++) {
            int maxlen = next_smaller[i] - prev_smaller[i] - 1;
            minval[maxlen - 1] = max(minval[maxlen - 1], arr[i]);
        }
    
        for (int i = n - 2; i >= 0; i--) 
            minval[i] = max(minval[i], minval[i + 1]);
    
        return minval;
    }
};