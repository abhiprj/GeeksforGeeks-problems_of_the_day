class GfG
{
    int max_sum(int A[], int n)
    {
    int ans=Integer.MIN_VALUE;
    int temp=0;
    int sum=0;
    int sumInd=0;
 
    for(int i=0;i<A.length;i++)
    {
    sum+=A[i];
    sumInd+=i*A[i];
    }
 
    for(int i=0;i<A.length;i++)
    {
        temp=sumInd-(sum-A[i])+(A[i]*(n-1));
        ans=Math.max(temp,ans);
        sumInd=temp;
    }
    return ans;
    }
}