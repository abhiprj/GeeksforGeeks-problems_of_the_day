class Solution
{
	public int maxSumIS(int A[], int n)  {  
	    int[] DP = new int[n];
	    for(int i = 0; i < n; ++i){
	        DP[i] = A[i];
	    }
	    
	    for(int i = 1; i < n; ++i){
	        for( int j = 0; j < i; ++j){
	            if(A[j] < A[i]){
	            DP[i] = Math.max(DP[i], DP[j] + A[i]);
	            }
	        }
	    }
	    int ret = 0;
	    for( int i = 0; i < n; ++i){
	        ret = Math.max(DP[i], ret);
	    }
	    return ret;
	}
}