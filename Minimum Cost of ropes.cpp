class Solution
{
    public:
    
    long long minCost(long long a[], long long n) 
    {
        priority_queue<long long, vector<long long>, greater<long long> > pq(a, a + n);
    
        long long answer = 0;

        while (pq.size() > 1) 
        {
            long long first = pq.top();
            pq.pop();
            
            long long second = pq.top();
            pq.pop();
    
            answer += first + second;
            
            pq.push(first + second);
        }
        
        return answer;
    }
};