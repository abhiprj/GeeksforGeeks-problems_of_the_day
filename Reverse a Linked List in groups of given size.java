class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
      //Your code here
        Node currNode=node;
        Node preNode=null;
        Node nextNode=null;
        
        int count=0;
        
        while(currNode!=null && count<k){
            nextNode=currNode.next;
            currNode.next=preNode;
            preNode=currNode;
            currNode=nextNode;
            
            count++;
        }
        
        
        if(nextNode!=null){
            node.next=reverse(nextNode,k);
        }
        return preNode;
    }
}