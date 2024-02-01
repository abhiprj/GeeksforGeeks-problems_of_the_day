class Solution
{
    public:
    Node* reverseBetween(Node* head, int m, int n)
    {
        //code here
        vector<int>res;
        Node *temp = head;
        while(temp){
            res.push_back(temp->data);
            temp = temp->next;
        }
        reverse(res.begin()+m-1, res.begin()+n);
        temp = head;
        for(int i  = 0 ; i < res.size() ; i++){
            temp->data = res[i];
            temp = temp->next;
        }
        return head;
    }
};