class Solution {
public:
    long long int largestPrimeFactor(int n) {
        int out = 2;
        int checkUpto = sqrt(n);
        for (int i = 2; i <= checkUpto; ++i) {
            while (n % i == 0) {
                n = n / i;
                out = max(out, i);
            }
        }
        out = max(out, n);
        return out;
    }
};