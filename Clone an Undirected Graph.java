class Solution{
    private Map<Node, Node> mp = new HashMap<>();
    Node cloneGraph(Node node){
        if (node == null) return null;
        if (mp.containsKey(node)) return mp.get(node);
        Node conn= new Node(node.val);
        mp.put(node, conn);
        for (Node adjacent : node.neighbors) {
            conn.neighbors.add(cloneGraph(adjacent));
        }
        return conn;
    }
}