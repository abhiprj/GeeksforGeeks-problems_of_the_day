class Solution {

    class Info {
        Node prev, first, second;

        public Info() {
            prev = first = second = null;
        }
    }

    public Node correctBST(Node root) {
        Info info = new Info();
        inOrderTraversal(root, info);

        if (info.first != null && info.second != null) {
            int temp = info.first.data;
            info.first.data = info.second.data;
            info.second.data = temp;
        }

        return root; 
    }

    private void inOrderTraversal(Node root, Info info) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, info);

        if (info.prev != null && root.data < info.prev.data) {
            if (info.first == null) {
                info.first = info.prev;
            }
            info.second = root;
        }

        info.prev = root;

        inOrderTraversal(root.right, info);
    }
}