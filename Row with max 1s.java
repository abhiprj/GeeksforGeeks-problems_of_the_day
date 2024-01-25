class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int res=-1;
        int max=0;
        
        for(int i=0;i<n;i++){
            int count=0;
            int j=m-1;
            while(j>=0 && arr[i][j]==1){
                count++;
                j--;
            }
            if(count>max) {
                res=i;
                max=count;
            }
          
        }
        
        return res;
        
    }
}