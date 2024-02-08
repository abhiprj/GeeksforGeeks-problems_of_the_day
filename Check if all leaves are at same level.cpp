class Solution{
  public:
    /*You are required to complete this method*/
    bool check(Node *root)
    {
        queue<pair<Node*,int>>q;
        q.push({root,0});
        int leaf_height = -1;
        while(!q.empty()){
            auto nd = q.front().first;
            auto h = q.front().second;
            q.pop();
            
            if(!nd->left && !nd->right){
                if(leaf_height == -1){
                    leaf_height = h;
                }
                else{
                    if(leaf_height != h)
                    return false;
                }
            }
            else{
            if(nd->left){
                q.push({nd->left,h+1});
            }
            if(nd->right){
                q.push({nd->right,h+1});
            }
            }
        }
        return true;
    }
};