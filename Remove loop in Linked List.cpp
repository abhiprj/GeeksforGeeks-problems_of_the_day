class Solution
{
    public:
    //Function to remove a loop in the linked list.
    void removeLoop(Node* head)
    {
        // code here
        // just remove the loop without losing any nodes
        Node *fast,*slow;
        fast=slow=head;
        while(fast!=NULL && fast->next!=NULL)
        {
            fast=fast->next->next;
            slow=slow->next;
            if(fast==slow)
            {
                slow=head;
                 if(slow == fast) {
              while(fast->next != slow) fast = fast->next;
        }
          else {
            while (slow->next != fast->next) {
                slow = slow->next;
                fast = fast->next;
            }
        }
 
        /* since fast->next is the looping point */
        fast->next = NULL; /* remove loop */
    }
            }
        
    }
};
