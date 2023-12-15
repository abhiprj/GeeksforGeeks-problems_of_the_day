class Solution
{
    public:
    
    Node* reverse(Node* head)
    {
        if(head == NULL || head->next == NULL)
            return head;
            
        Node* rest = reverse(head->next);
        head->next->next = head;
 
        head->next = NULL;
 
        return rest;
    }
    
    Node *compute(Node *head)
    {
        head = reverse(head);
        Node *current = head;
        
        int max = head->data;
        Node *prev = head;
        head = head->next;
        while(head != NULL)
        {
            if(head->data >= max)
            {
                max = head->data;
                prev = head;
                head = head->next;
            }
            else
            {
                prev->next = head->next;
                head = prev->next;
            }
        }
        
        head = reverse(current);
        
        return head;
    }
    
};