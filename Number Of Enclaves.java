class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int count=0;
        int m= grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++)
        {
            if(grid[i][0]==1)
                dfs(i,0,grid);
            if(grid[i][n-1]==1)
                dfs(i,n-1,grid);
        }
        for(int i=0;i<n;i++)
        {
            if(grid[0][i]==1)
                dfs(0,i,grid);
            if(grid[m-1][i]==1)
                dfs(m-1,i,grid);
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                    count++;
            }
        }
        return count;
    }

    private void dfs(int i, int j, int[][] grid) {
        if(i<0||i>= grid.length||j<0||j>=grid[0].length||grid[i][j]!=1)
            return;
        grid[i][j]=0;
        dfs(i+1, j, grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
        
    }
}