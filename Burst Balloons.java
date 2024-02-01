class Solution {

  public static int solveMemo(int i,int j,int arr[],int[][] dp){
      if(i>j)return 0;
      if(dp[i][j]!=-1){
          return dp[i][j];
      }
      int maxi = Integer.MIN_VALUE;
      for(int k=i;k<=j;k++){
          maxi=(int)Math.max(maxi,arr[k]*arr[i-1]*arr[j+1]+solveMemo(i,k-1,arr,dp)+solveMemo(k+1,j,arr,dp));
      }
      return dp[i][j]=maxi;
  }    
  
  public static int maxCoins(int N, int[] arr) {
    int arr1 []= new int[N+2];
    arr1[0]=1;
    for(int i=0;i<N;i++){
        arr1[i+1]=arr[i];
    }
    arr1[N+1]=1;
    int [][] dp = new int[N+3][N+3];
    for(int i=0;i<N+3;i++){
        Arrays.fill(dp[i],-1);
    }
    return solveMemo(1,N,arr1,dp);
  }
}