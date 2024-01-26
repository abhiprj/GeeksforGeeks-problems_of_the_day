class Solution{
    // int [][]dp;
    // int solve(int [][]costs,int i,int j) {
    //     if(i==costs.length)
    //         return 0;
    //     if(dp[i][j]!=-1)
    //         return dp[i][j];
    //     int res = Integer.MAX_VALUE;
    //     for(int k=0;k<costs[i].length;k++){
    //         if(k==j)
    //             continue;
    //         int temp = solve(costs,i+1,k);
    //         res = Math.min(res,temp);
    //     }
    //     return dp[i][j] = res+costs[i][j];
    // }
	int minCost(int [][] costs) {
	    int n = costs.length,m = costs[0].length;
	    if(n==1 && m==1)
	        return costs[0][0];
	    else if(m==1)
	        return -1;
	    int a = -1,b = -1;
	    for(int i=0;i<m;i++) {
	        if(a==-1 || costs[0][i]<costs[0][a]){
	            b = a;
	            a = i;
	        }
	        else if(a!=i && (b==-1 || costs[0][i]<=costs[0][b]))
	            b = i;
	    }
	   // System.out.println(a+" "+b);
	    for(int i=1;i<n;i++) {
	        int x = -1,y = -1;
	        for(int j=0;j<m;j++) {
	            int res = 0;
	            if(j!=a)
	                res = costs[i-1][a];
	            else if(j!=b)
	                res = costs[i-1][b];
	            costs[i][j]+=res;
	            if(x==-1 || costs[i][j]<costs[i][x]){
	                y = x;
	                x = j;
	            }
	            else if(x!=j && (y==-1 || costs[i][j]<=costs[i][y]))
	                y = j;
	        }
	       // System.out.println(x+" "+y);
	        a = x;
	        b = y;
	    }
    
	    int res = Integer.MAX_VALUE;
	    for(int i=0;i<m;i++)
	        res = Math.min(res,costs[n-1][i]);
	    return res;
	}
}