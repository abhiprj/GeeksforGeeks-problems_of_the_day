class Solution {
    static int cnt;
    public int countWaystoDivide(int N, int K) {
        if(K==1)return 1;
        cnt=0;
        for(int i=1;i<=N/K;i++){
            f(N-i,K-1,i);
        }
        return cnt;
    }
    void f(int n,int k,int minv){
        if(k==1){cnt++;return;}
        for(int i=minv;i<=n/k;i++){
            f(n-i,k-1,i);
        }
    }
}
