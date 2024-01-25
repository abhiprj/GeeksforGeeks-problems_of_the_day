class Solution 
{  private:
    bool knows(vector<vector<int> >& M,int a,int b){
        if(M[a][b] == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public:
int celebrity(vector<vector<int> >& M, int n) 
{
    stack<int> s;
    for(int i = 0; i < n; i++) {
        s.push(i);
    }
    while(s.size() > 1) {
        int a = s.top();
        s.pop();
        int b = s.top();
        s.pop();
        if(knows(M, a, b)) {
            s.push(b);
        }
        else {
            s.push(a);
        }
    }
    int candidate = s.top();


    bool checkRow = true;
    for(int i = 0; i < n; i++) {
        if (i != candidate && M[candidate][i] == 1) {
            checkRow = false;
            break;
        }
    }


    bool columnCheck = true;
    for(int i = 0; i < n; i++) {
        if (i != candidate && M[i][candidate] == 0) {
            columnCheck = false;
            break;
        }
    }

    if(checkRow && columnCheck) {
        return candidate;
    }
    else {
        return -1;
    }
}


};