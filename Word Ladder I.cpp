class Solution {
public:
    int wordLadderLength(string startWord, string targetWord, vector<string>& wordList) {
        map<string, int> m;
        for(int i=0;i<wordList.size();i++)
        {
            m[wordList[i]]++;
        }
        
        m.erase(startWord);
        queue<pair<string, int>> q;
        q.push({startWord, 1});
        while(!q.empty())
        {
            string word = q.front().first;
            int steps = q.front().second;
            q.pop();
            if(word == targetWord)
                return steps;
                
            for(int i=0;i<word.size();i++)
            {
                char original = word[i];
                for(char ch='a';ch<='z';ch++)
                {
                    word[i] = ch;
                    if(m.find(word) != m.end())
                    {
                        q.push({word, steps+1});
                        m.erase(word);
                    }
                    word[i] = original;
                }
            }
        }
        
        return 0;
    }
};