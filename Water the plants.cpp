class Solution{
    public:
    int min_sprinklers(int gallery[], int n)
    {
       vector<pair<int,int>>v;
       for(int i=0;i<n;i++){
           if(gallery[i] !=-1){
               int left=i- gallery [i];
               int right= i+ gallery[i];
               v.push_back({left,right});
           }
       }
       sort(v.begin(),v.end());
       int target =0, cnt=0,i=0;
       while(target<n){
           if(i==v.size() || v[i].first >target)
           return -1;
           int rng = v[i]. second;
           while (i+1<v.size() && v[i+1].first<=target){
               i++; rng =max(rng,v[i]. second);
           }
           if(rng<target) return -1;
           cnt++;
           target = rng +1 ;
           i++;
       }
       return  cnt;
    }
};