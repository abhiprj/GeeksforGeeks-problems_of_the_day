class Solution
{
    void deleteNode(Node del_node)
    {
         // Your code here
          if(Objects.nonNull(del_node) && Objects.nonNull(del_node.next)){
             del_node.data = del_node.next.data;
             del_node.next = del_node.next.next;
         }
         else {
             del_node = null;}
    }
}