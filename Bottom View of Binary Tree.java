class Solution
{
    static class Pair{
        Node node;
        int dist;
        Pair(Node node , int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
         ArrayList<Integer> res = new ArrayList<>();
         if (root == null)return res;
         Map<Integer , Integer> map = new TreeMap<>();
         Queue<Pair> q = new LinkedList<>();
         q.add(new Pair(root,0));
         while(!q.isEmpty()){
             Pair p = q.remove();
             Node cur = p.node;
             int dist = p.dist;
             
             map.put(dist , cur.data);
             if(cur.left != null)q.add(new Pair(cur.left , dist-1));
             if(cur.right != null)q.add(new Pair(cur.right , dist+1));
             
         }
         
         for(Integer key : map.keySet()){
             res.add(map.get(key));
         }
         return res;
    }
}