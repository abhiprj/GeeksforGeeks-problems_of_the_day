class Solution {
public:
    string s = "";

    void perm(int n) {
        int i, j;
        for (i = n - 2; i >= 0; --i) {
            if (s[i] < s[i + 1])
                break;
        }
        for (j = n - 1; j > i; --j) {
            if (s[j] > s[i])
                break;
        }
        swap(s[j], s[i]);
        sort(s.begin() + i + 1, s.end());
    }

    vector<string> find_permutation(string S) {
        int n = S.size();
        vector<string> out;
        sort(S.begin(), S.end());
        s = S;
        out.push_back(s);
        sort(S.begin(), S.end(), greater<>());

        while (S != s) {
            perm(n);
            out.push_back(s);
        }

        return out;
    }
};