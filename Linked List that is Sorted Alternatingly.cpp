class Solution
{
    public:
    // your task is to complete this function
    void sort(Node **head)
    {
         priority_queue<int,vector<int>,greater<int>>pq;
          Node* temp=*head;
         while(temp){
             pq.push(temp->data);
             temp=temp->next;
         }
          Node* tmp=*head;
         while(tmp){
             tmp->data=pq.top();
             pq.pop();
             tmp=tmp->next;
         }
    }
};