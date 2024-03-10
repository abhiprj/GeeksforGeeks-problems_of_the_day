
class Solution {
    String removeDuplicates(String str) {
        Set<Character> set=new HashSet<Character>();
        StringBuffer res=new StringBuffer();
        for(char ch:str.toCharArray())
        {
            if(!set.contains(ch))
            {
                res.append(ch);
                set.add(ch);
            }
        }
       return res.toString(); 
    }
}