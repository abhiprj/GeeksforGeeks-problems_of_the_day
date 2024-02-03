class Solution {
  public:
    int gameOfXor(int N , int A[]) {
        if (N % 2 == 0)
            return 0;

        int XOR = 0;
        for (int i = 0; i < N; i += 2)
            XOR ^= A[i];
        return XOR;
    }
};


