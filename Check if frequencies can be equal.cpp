class Solution{
public:	
	bool sameFreq(string s)
	{
	    unordered_map<char,int> map;
	    for(auto x:s)
	    map[x]++;
	    
	    int mn=INT_MAX,mx=INT_MIN,mxCount=0,mnCount=0;
	    
	    for(auto x:map){
	        mn=min(mn,x.second);
	        mx=max(mx,x.second);
	    }
	    for(auto x:map){
	        if(x.second==mx)mxCount++;
	        else if(x.second==mn)mnCount++;
	    }
	    if(mn==mx or (mn==mx-1 and mxCount==1))return true;
	    if(mnCount==1 and mn==1 and mxCount+mnCount==map.size())return true;
	    return false;
	}
};