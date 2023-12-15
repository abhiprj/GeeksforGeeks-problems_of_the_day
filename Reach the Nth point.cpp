class Solution
{
	public:
	int nthPoint(int n)
	{
	    long long a=1, b=1, mod=1e9+7;
	    for(int i=1;i<n;i++)
	    {
	        long long c=(a+b)%mod;
	        a=b;
	        b=c;
	    }
	    return b;
	}
};