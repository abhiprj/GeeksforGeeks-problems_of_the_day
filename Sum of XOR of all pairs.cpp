class Solution{
    public:
    // Returns sum of bitwise OR
    // of all pairs
    long long int sumXOR(int arr[], int n)
    {
        long long int res=0;
    	for (int i=0;i<=31;i++){
    	    
    	    long long int cnt0 =0, cnt1=0;
    	    
    	    for (int j=0; j<n;j++){
    	        if (arr[j] & (1<<i)) cnt1++;
    	        else cnt0++;
    	        
    	        
    	    }
    	    
    	    long long int p=cnt0*cnt1;
    	    res+=((1<<i)*p);
    	}
    	return res;
    }
};