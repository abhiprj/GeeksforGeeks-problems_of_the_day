class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        Node head1=head;
        int length=0;
        while(head1!=null){
            length++;
            head1=head1.next;
        }
        Node current=head;
        int len=length;
        for (int i = 0; i < len; i++) {
            current = head;
            for (int j = 0; j < len - i - 1; j++) {
                if (current.data > current.next.data) {
                    int swap = current.data;
                    current.data = current.next.data;
                    current.next.data = swap;
                }
                current = current.next;
            }
        }
        return head;
    }
}