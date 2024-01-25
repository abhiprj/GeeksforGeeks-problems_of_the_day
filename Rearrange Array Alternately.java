class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
                int l=0,r=n-1;
       
       long b[]=new long[n];
     
         for(int i=0;i<n;i++)
         {
          if(i%2==0){
              b[i]=arr[r--];
          }
          else
              b[i]=arr[l++];
             
         } 
         for(int j=0;j<n;j++){
            arr[j]= b[j];
         }
    }
    
}