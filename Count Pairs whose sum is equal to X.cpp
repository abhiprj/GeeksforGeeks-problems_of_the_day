
class Solution{
  public:
    // your task is to complete this function
    int countPairs(struct Node* head1, struct Node* head2, int x) {
        unordered_map<int,int>mp;
        Node* temp=head2;
        int num=0;
        while(temp!=NULL){
            num=temp->data;
            mp[num]++;
            temp=temp->next;
        }
        temp=head1;
        int rem=0;
        int count=0;
        while(temp!=NULL){
            rem=x-temp->data;
            if(mp[rem]>0){
                count++;
                mp[rem]--;
            }
            temp=temp->next;
        }
        return count;
        // Code here
    }
};
