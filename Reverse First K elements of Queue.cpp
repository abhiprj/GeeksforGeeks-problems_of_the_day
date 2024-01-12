class Solution
{
    public:
    
    // Function to reverse first k elements of a queue.
    queue<int> modifyQueue(queue<int> q, int k) {
         stack<int>st;
        int m=q.size()-k;
        for(int i=0;i<k;i++){
            int front=q.front();
            q.pop();
            st.push(front);
        }
        for(int i=0;i<k;i++){
            int front=st.top();
            st.pop();
            q.push(front);
        }
        for(int i=0;i<m;i++){
            int front=q.front();
            q.pop();
            q.push(front);
        }
        return q;
    }
};