class Solution
{
    public void swapElements(int[] arr, int n)
    {   
        for(int i=0;i<n-2;i++){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        // Code here
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(arr);
    }
}