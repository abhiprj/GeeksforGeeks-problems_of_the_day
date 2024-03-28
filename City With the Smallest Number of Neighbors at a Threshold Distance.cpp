class Solution {
  public:
    int findCity(int n, int m, vector<vector<int>>& edges, int distanceThreshold) {
        // Your code here
        
        vector<vector<pair<int, int>>> adj(n);
        for(int i = 0; i < m; i++){
            adj[edges[i][0]].push_back({edges[i][2], edges[i][1]});
            adj[edges[i][1]].push_back({edges[i][2], edges[i][0]});
        }
        
        int ans = -1, mini = INT_MAX;
        for(int i = 0; i < n; i++){
         
            priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
            
            vector<int> vis(n, 0);
            
            pq.push({0, i});
            int cnt = 0;
            
            while(!pq.empty()){
                
                auto it = pq.top();
                pq.pop();
                
                int dist = it.first;
                int node = it.second;
                
                if(vis[node] == 1) continue;
                
                vis[node] = 1;
                
                if(dist > distanceThreshold) continue;
                
                cnt++;
                
                for(auto nbr_pair : adj[node]){
                    
                    int nbr_dist = nbr_pair.first;
                    int nbr_node = nbr_pair.second;
                    
                    
                    if(vis[nbr_node] == 0){
                        
                        pq.push({dist + nbr_dist, nbr_node});
                    }
                }
                
            }
            
            if(cnt <= mini){
                mini = cnt;
                ans = i;
            }
        }
        
        return ans;
        
    }
};