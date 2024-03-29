class Solution {
public:
    void fill(int i, int j, vector<vector<int>>& mat, vector<int>& out){
        while(i < mat.size() && j >= 0){
            out.push_back(mat[i][j]);
            ++i;
            --j;
        }
    }
    vector<int> antiDiagonalPattern(vector<vector<int>>& mat) 
    {
        vector<int> out;
        int n = mat.size();
        for(int j = 0; j < n; ++j)
            fill(0, j, mat, out);
        
        for(int i = 1; i < n; ++i)
            fill(i, n-1, mat, out);
        
        return out;
    }
};
