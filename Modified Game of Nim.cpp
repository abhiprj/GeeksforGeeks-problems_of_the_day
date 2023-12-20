class Solution {
public:
    int findWinner(int n, int A[]) {
        int XOR = 0;
        for(int i = 0; i < n; i++)
            XOR ^= A[i];

        if(XOR == 0)
            return 1;

        return n % 2 == 0 ? 1 : 2;
    }
};