class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
    
        int count[] = new int [26];
        int counts =0;
        String st = s.toLowerCase();
        for(char ch : st.toCharArray()){
            if(ch<='z'&& ch>='a'){
                if(count[ch-'a']==0){
                    count[ch-'a']++;
                    counts++;
                }
            }
        }
        return counts==26;
    
    }
}