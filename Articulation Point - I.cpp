class Solution {
  public:
    vector<int> parent;
    vector<int> AP;
    vector<int> disc;
    vector<int> low;
    
    void DFS(vector<int> adj[], int u, int& discTime) {
        int child = 0;
        disc[u] = low[u] = discTime++;
        bool isAP = false;
        
        for (int v : adj[u]) {
            if (disc[v] == -1) {
                child++;
                parent[v] = u;
                DFS(adj, v, discTime);
                low[u] = min(low[u], low[v]);
                
                if (parent[u] != -1 && low[v] >= disc[u]) {
                    isAP = true;
                }
            }
            else if (v != parent[u]) {
                low[u] = min(low[u], disc[v]);
            }
            
        }
        
        if ((parent[u] == -1 && child >= 2) || isAP) {
            AP.push_back(u);
        }
    }
    
    vector<int> articulationPoints(int V, vector<int>adj[]) {
        // Code here
        parent.assign(V, -1);
        disc.assign(V, -1);
        low.assign(V, -1);
        int discTime = 0;
        
        DFS(adj, 0, discTime);
        
        if (AP.size() == 0) {
            return {-1};
        }
        
        sort(AP.begin(), AP.end());
        
        return AP;
    }
};