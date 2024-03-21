class Tree {
   public static void solve(Node root, int level, ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        if(ans.size()==level){
            ans.add(root.data);
        }
        else{
            ans.set(level, ans.get(level) + root.data);
        }
        solve(root.right, level, ans);
        solve(root.left, level+1, ans);
    }
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root,0, ans);
        return ans;
    }
}