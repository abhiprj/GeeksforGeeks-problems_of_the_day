class Solution{
    public:
    int t[1002][1002];

    int countMax(int i, int n, int amount, vector<int> &cost){
        
    	if(i==n) return 0;
    	if(amount <=0) return 0;
    	
    	if(t[i][amount] != -1) return t[i][amount];
    	
    	int take = 0, notTake = 0;
    	
    	if(amount >= cost[i]){
    	    take = 1 + countMax(i+1, n, amount - cost[i]/10.0, cost);
    	}
    	notTake = countMax(i+1, n, amount,cost);
    	return t[i][amount] = max(take, notTake);

    }

    int max_courses(int n, int total, vector<int> &cost){
    	
    	memset(t,-1,sizeof(t));
    	return countMax(0, n, total, cost);
    }
};
