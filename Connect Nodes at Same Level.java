class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node top = q.peek();
            q.poll();
            if (top==null){
                if (!q.isEmpty()){
                    q.add(null);
                }
            }else{
                top.nextRight=q.peek();
                if (top.left!=null) q.add(top.left);
                if (top.right!=null) q.add(top.right);
            }
        }
    }
}