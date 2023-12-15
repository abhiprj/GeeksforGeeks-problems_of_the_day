class Solution 
{
  public:
    int setBits(int n) 
    {
        int counter = 0;
        int rem = 0;
        
        while(n > 0)
        {
            rem = n%2;
            if(rem == 1)
                counter++;
            n = n/2;
        }
        
        return counter;
    }
};
