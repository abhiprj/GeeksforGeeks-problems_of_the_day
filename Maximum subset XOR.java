class Solution
{
    public static int maxSubsetXOR(int arr[], int N)
    {
        //add code here
        if(N==0) return 0;
        int ans=0;
        while(true){
           int max=Integer.MIN_VALUE;
           //get the max value from the array after each iteration
           for(int i=0;i<N;i++){
               if(arr[i]>max)max=arr[i];
           }
           //if max=0 => whole array 0, then return ans; 
           if(max==0) return ans;
           
           //replace each element with xor with max;
           ans=Math.max(ans,ans^max);
           for(int i=0;i<N;i++){
               arr[i]=Math.min(arr[i],arr[i]^max);
           }
           
        }
        // return ans;
    }
}