class Solution{
    long sum;
    public long largesSumCycle(int N, int Edge[]){
        long[] values = new long[N];
        sum = -1l;
        for(int i=0; i<N; i++){
            if( Edge[i]>-1 ){
                bt(i, 0l, Edge, values);
            }
        }
        return sum ;
    }
    
    private void bt(int idx, long curSum, int[]edge, long[]values){
        if(edge[idx] == -1) return ;
        if(edge[idx]==-2){
            sum = Math.max(sum, curSum-values[idx]);
            return ;
        }
        int next = edge[idx];
        edge[idx] = -2;         // marking currently visited.
        values[idx] = curSum;       // storing the total index sum till now.
        
        bt(next, curSum+idx, edge, values);
        edge[idx] = -1;             // making past visited or making invalid to avoid visit next time.
    }
}