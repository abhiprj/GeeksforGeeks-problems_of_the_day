class Tree
{
    //Function to return the maximum difference between any 
    //node and its ancestor.
    static int ans;
    
    int maxDiff(Node root)
    {
        //your code here
         ans = Integer.MIN_VALUE;
        
        dfs(root.left,root.data);   // left
        dfs(root.right,root.data);  // right
        
        return ans;
    }
    public void dfs(Node root,int max){

        if(root == null){
            return;
        }

        ans = Math.max(max-root.data, ans);

        max = Math.max(root.data, max);
        
        dfs(root.left, max);
        dfs(root.right, max);
    }
}