class Solution {
public:
    int posOfRightMostDiffBit(int m, int n) {
        if (m == n)
            return -1;
            
        int res = m ^ n;
        res = res & (-res);
        return log2(res) + 1;
    }
};