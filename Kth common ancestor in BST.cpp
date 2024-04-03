class Solution
{
    public:
    
map<Node*,Node*> par;
    Node* lca(Node* root, int x, int y)
    {
        if(root == NULL)
        {
            return NULL;
        }
        if(root->data == x || root->data == y)
        {
            return root;
        }
        if(root->left)
        {
            par[root->left] = root;
        }
        if(root->right)
        {
            par[root->right] = root;
        }
        Node* left = lca(root->left, x, y);
        Node* right = lca(root->right, x, y);
        
        if(!left && !right)
        {
            return NULL;
        }
        else if(left == NULL)
        {
            return right;
        }
        else if(right == NULL)
        {
            return left;
        }
        else if(left && right)
        {
            return root;
        }
    }
    /*You are required to complete below function */
    int kthCommonAncestor(Node *root, int k,int x, int y)
    {
        Node* ans = lca(root,x,y);
        k--;
        while(k--)
        {
            if(ans == root) return -1;
            ans = par[ans];
        }
        return ans->data;
    }
};