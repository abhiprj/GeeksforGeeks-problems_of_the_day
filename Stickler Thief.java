class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        // int max=0;
        // int sum=0;
        // int i=1;
        // int p=0;
        // int prev=0;
        // sum=arr[0];
        // while(i<n)
        // {
        //     if(prev+1!=i)
        //     {
        //     sum=sum+arr[i];
        //      p=i;
        //   prev=i;
        //     }
        //     else if(arr[p]<arr[i]&&p+1==i)
        //     {
        //         sum=sum-arr[p]+arr[i];
               
        //          p=i;
        //   prev=i;
               
        //     }
        
        //   i++;
           
        // }
        // return sum;
         int a=arr[0];
        int b=arr[1];
        for(int i=2;i<n;i++){
            int k=Math.max(a,b);
            b=a+arr[i];
            a=k;
        }
        return Math.max(a,b);
    }
}