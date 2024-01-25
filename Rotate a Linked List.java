
class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
       
        Node temp = head;
        Node curr = head;
        Node rotateHead = head;
        
        for(int i=0;i<k-1;i++){
            temp=temp.next;
        }
    
        while(curr.next!= null){
            curr = curr.next;
        }
        //System.out.println(curr.next.data);
        curr.next = head;
         rotateHead = temp.next;
         //if(temp.next==null) return head;
         temp.next=null;
         
         return rotateHead;
    }
}