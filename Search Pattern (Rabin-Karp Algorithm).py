class Solution:
    def search(self, pattern, text):
        # code here
        l=[]
        i=0
        j=len(pattern)
        while(j<=len(text)):
            if(text[i:j:1]==pattern):
                l.append(i+1)
            i+=1;
            j+=1;
        return l
        