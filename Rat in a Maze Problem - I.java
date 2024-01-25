class Solution {
    
    public static void solveMaze(int[][] m, int r, int c,String s,int n, ArrayList<String> ans, boolean[][] vis)
    {
        if(r==n-1 && c==n-1 && m[r][c]!=0)
        {
            ans.add(s);
            return;
        }
        
        if(r>=0 && c>=0 && r<n && c<n)
        {
            
            if(vis[r][c] == true || m[r][c]== 0) return;
            
                vis[r][c] = true;
                solveMaze(m,r+1,c,s+"D",n,ans,vis);//D
                solveMaze(m,r-1,c,s+"U",n,ans,vis);//U
                solveMaze(m,r,c+1,s+"R",n,ans,vis);//R
                solveMaze(m,r,c-1,s+"L",n,ans,vis);//L

           vis[r][c] = false;
        }
        
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans  = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];
        
        solveMaze(m,0,0,"",n,ans, vis);
        
        return ans;
        
    }
}