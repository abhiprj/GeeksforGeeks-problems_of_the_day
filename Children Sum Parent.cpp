class Solution{
    public:
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    int isSumProperty(Node *root)
    {
     // Add your code here
        if(!root)return 1;
        if(root->left && root->right){
            if(root->left->data + root->right->data != root->data)return 0;
            return isSumProperty(root->left)&&isSumProperty(root->right);
        }
        else if(root->left){
            if(root->left->data != root->data)return 0;
            return isSumProperty(root->left);
        }
        else if(root->right){
            if(root->right->data != root->data)return 0;
            return isSumProperty(root->right);
        }
        else{
            return 1;
        }
    }
};