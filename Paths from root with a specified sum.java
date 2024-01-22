class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        solve(root,sum,arr,list,0);
        return arr;
    }
    public static void solve(Node root , int sum , ArrayList<ArrayList<Integer>>arr,ArrayList<Integer>list,int currsum){
        if(root==null){
            return ;
        }
        currsum+=root.data;
        list.add(root.data);
        if(currsum==sum){
            arr.add(new ArrayList<>(list));
        }
        solve(root.left,sum,arr,list,currsum);
        solve(root.right,sum,arr,list,currsum);
        
        list.remove(list.size()-1);
    }
}