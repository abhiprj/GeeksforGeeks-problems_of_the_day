class Solution {
  public:
    string longestSubstring(string s, int n) {
        // code here
        int cur = 0 ;
        string ans = "-1";
        
        int i = 0 ; 
        
        while(i<n)
        {
            int t = 1 ; 
            string temp = s.substr(i,t);
            
            while(2*t<=n && s.substr(i+t).find(temp)!=string::npos)
            {
                if(cur<t)
                {
                    cur = t ; 
                    ans = temp;
                }
                    t++;
                    temp = s.substr(i,t);
            }
            i++;
        }
        
        return ans;
    }
};