class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here.
        int size =0;
        Node curr =head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        int arr[] = new int[size];
        curr = head;
        int i=0;
        while(curr!=null){
            arr[i] = curr.data;
            i++;
            curr= curr.next;
        }
        Arrays.sort(arr);
        Node node = new Node(0);
        Node head1 = node;
        curr = head1;
        int j=0;
        while(j!=arr.length){
            Node newnode = new Node(arr[j]);
            curr.next = newnode;
            curr = curr.next;
            j++;
        }
        return head1.next;
        
        
    }
}