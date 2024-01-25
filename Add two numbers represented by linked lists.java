
class Solution{
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node dummy = new Node(0);
        Node d=dummy;
        Node rev1= reverse(first);
        Node rev2=reverse(second);
        Node temp1=rev1;
        Node temp2=rev2;
        int sum=0;
        while(temp1!=null || temp2!=null){
            if(temp1!=null) sum+=temp1.data;
            if(temp2!=null) sum+=temp2.data;
            int rem=sum%10;
            Node t = new Node(rem);
            d.next=t;
            d=d.next;
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
            sum/=10;
        }
        if(sum!=0){
            Node t = new Node(sum);
            d.next=t;
        }
        Node drev=reverse(dummy.next);
        return drev;
        
    }
}