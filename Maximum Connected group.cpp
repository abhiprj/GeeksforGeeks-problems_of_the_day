class DSU{
    public:
    int *size,*parent;
    
    DSU(int s)
    {
        size=new int[s+1];
        parent=new int[s+1];
        
        for(int i=0;i<s+1;i++)
        {
            size[i]=1;
            parent[i]=i;
        }
    }
    
    int findroot(int u)
    {
        if(parent[u]==u)
        return u;
        
        return parent[u]=findroot(parent[u]);
    }
    
    void union_by_size(int u,int v)
    {
        int root_u=findroot(u);
        int root_v=findroot(v);
        
        if(root_u==root_v)
        return;
        
        if(size[root_u]>size[root_v])
        {
            parent[root_v]=root_u;
            size[root_u]+=size[root_v];
        }
        else 
        {
            parent[root_u]=root_v;
            size[root_v]+=size[root_u];
        }
    }
};
class Solution {
  public:
    int MaxConnection(vector<vector<int>>& grid) {
        
        int n=grid.size();
        DSU ds(n*n);
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    int pos=i*n+j;
                    //left
                    if(j-1>=0 && grid[i][j-1]==1)
                    ds.union_by_size(pos,n*i+j-1);
                    
                    
                    //right
                    if(j+1<n && grid[i][j+1]==1)
                    ds.union_by_size(pos,n*i+j+1);
                    
                    //up
                    if(i-1>=0 && grid[i-1][j]==1)
                    ds.union_by_size(pos,n*(i-1)+j);
                    
                    //down
                    if(i+1<n && grid[i+1][j]==1)
                    ds.union_by_size(pos,n*(i+1)+j);
                }
            }
        }
        
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              
                if(grid[i][j]==0)
                {
                    int x=i;
                    int y=j;
                    int temp=1;
                    
                    unordered_set<int> st;
                    
                    //left
                    if(y-1>=0 && grid[x][y-1]==1)
                    {
                        int root=ds.findroot(n*x+y-1);
                        if(st.find(root)==st.end())
                        {
                            st.insert(root);
                            temp+=ds.size[root];
                        }
                    }
                    
                    //right
                    if(y+1<n && grid[x][y+1]==1)
                    {
                        int root=ds.findroot(n*x+y+1);
                        if(st.find(root)==st.end())
                        {
                            st.insert(root);
                             temp+=ds.size[root];
                        }
                    }
                    
                    //up
                    if(x-1>=0 && grid[x-1][y]==1)
                    {
                        int root=ds.findroot(n*(x-1)+y);
                        if(st.find(root)==st.end())
                        {
                            st.insert(root);
                             temp+=ds.size[root];
                        }
                    }
                    //down
                    if(x+1<n && grid[x+1][y]==1)
                    {
                        int root=ds.findroot(n*(x+1)+y);
                        if(st.find(root)==st.end())
                        {
                            temp+=ds.size[root];
                        }
                    }
                    ans=max(temp,ans);
                }
            }
        }
        if(ans==0)
        return n*n;
        return ans;
    }
};