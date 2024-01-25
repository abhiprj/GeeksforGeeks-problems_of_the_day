class Solution
{
	boolean isSumTree(Node root)
	{
        if(root == null) return true;
        
        if(root.left == null && root.right == null) return true;
        
        int left = isNode(root.left) ? getData(root.left) * 2 : getData(root.left);
        int right = isNode(root.right) ? getData(root.right) * 2 : getData(root.right);
        
        return (root.data == left + right) 
                && isSumTree(root.left) 
                && isSumTree(root.right);
	}
	
	static boolean isNode(Node root) {
	    if (root == null) return false;
	    if (root.left != null || root.right != null) {
	        return true;
	    }
	    return false;
	}
	
	static int getData(Node root) {
	    if (root == null) return 0;
	    return root.data;
	}
}