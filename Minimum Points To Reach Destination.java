class Solution
{
	public int minPoints(int points[][],int M,int N) { 
	   int[][] DP = new int[M][N];
	   if(1 - points[M-1][N-1] > 1){
	        DP[M-1][N-1] = 1 - points[M-1][N-1];
	   }
	   else{
	        DP[M-1][N-1] = 1;
	   }
	   for( int i = N-2; i >= 0; --i){
	       DP[M-1][i] = DP[M-1][i+1] - points[M-1][i];
	       if(DP[M-1][i] < 1){
	           DP[M-1][i] = 1;
	       }
	   }
	   for( int i = M-2; i >= 0; --i){
	       DP[i][N-1] = DP[i+1][N-1] - points[i][N-1];
	       if(DP[i][N-1] < 1){
	           DP[i][N-1] = 1;
	       }
	   }
	   for( int i = M-2; i >= 0; --i){
	    for( int j = N-2; j >= 0; --j){
	       DP[i][j] = Math.min(Math.max(DP[i+1][j] - points[i][j],1),
	                        Math.max(DP[i][j+1] - points[i][j],1));
            	
	       }
	   }
	   return DP[0][0];
	   
	}   
}