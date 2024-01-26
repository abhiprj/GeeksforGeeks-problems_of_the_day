class Solution 
{ 
    int palindromeSubStrs(String s)
    {
        int n = s.length();
        if(n == 1)
        return 1;
        HashMap<String, Integer>hm = new HashMap<>();
        for(int i = 0;i<n;++i)
        {
            String x = s.substring(i,i+1);
            hm.put(x,hm.getOrDefault(x,0)+1);
            int left1 = i-1;
            int right1 = i+1;
            while(left1>=0 && right1<n)
            {
                if(s.charAt(left1) == s.charAt(right1))
                {
                    String y = s.substring(left1,right1+1);
                    hm.put(y,hm.getOrDefault(y,0)+1);
                    left1--;
                    right1++;
                }
                else
                break;
            }
            int left2 = i; int right2 = i+1;
            while(left2>=0 && right2<n)
            {
                if(s.charAt(left2) == s.charAt(right2))
                {
                    String z = s.substring(left2,right2+1);
                    hm.put(z,hm.getOrDefault(z,0)+1);
                    left2--;
                    right2++;
                }
                else
                break;
            }
        }
        return hm.size();
    }
} 