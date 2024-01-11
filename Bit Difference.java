class Solution{
    /*private final static int mod = 1000000007;
    static int countBits(int N, long A[])
    {
        // code here
        int count=0;
        int result=0;
        for(int i=0;i<32;i++){
            count=0;
            for(int j=0;j<N;j++){
                if((A[j] & (1<<i))!=0)
                    count++;
            }
            result+=(((count)*(N-count)*2)%mod);
        }
        return result%mod;
    }*/
    
    private final static long mod = 1000000007;
    static int countBits(int N, long A[])
    {
        // code here
        long ans=0;
        for(int i=0;i<31;i++){
            long cz=0,co=0;
            for(long e:A){
                if((e&(1<<i))>0){
                    co++;
                } /*else {
                    cz++;
                }*/
            }
            //ans=(ans+2*co*cz)%mod;
            ans=(ans+2*co*(N-co))%mod;
        }
        return (int)ans;
    }
}