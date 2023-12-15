class Solution 
{
public:
    void multiply(int x , vector <int> &result)
    {
        int carry = 0;  
     
        for(int i=0 ; i<result.size() ; i++)
        {
            int prod = result[i] * x + carry;

            result[i] = prod % 10; 

            carry  = prod/10;   
        }

        while(carry)
        {
            result.push_back(carry % 10);
            carry = carry/10;
        }
    }
    
    vector <int> factorial(int N)
    {
        vector <int> answer;
        
        answer.push_back(1);
        int size = 1;
 
        for(int i=2 ; i <= N ; i++)
            multiply(i , answer);
        
        reverse(answer.begin() , answer.end());
        
        return answer;
    }
};