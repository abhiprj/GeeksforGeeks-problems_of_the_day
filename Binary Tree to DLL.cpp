class Solution
{
    public: 
    Node *previous = NULL;
    Node *head = NULL;
    Node* bToDLL(Node *root)
    {
        if(root == NULL)
            return NULL;
        
        bToDLL(root->left);
        
        if(previous == NULL)
        {
            head = root;
            previous = root;
        }
        else
        {
            previous->right = root;
            root->left = previous;
            previous = root;
        }
        
        bToDLL(root->right);
        
        return head;
    }
};