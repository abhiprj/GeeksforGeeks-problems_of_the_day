class Solution {
    public static int minChar(String str) {
       //Write your code here
       
       int n=str.length();
       int start = 0;
       int end = n-1;
       
       int res= 0;
       
       while(start<end){
           if(str.charAt(start) == str.charAt(end)){
               start++;
               end--;
           }else{
               res = str.length()-end;
               start = 0;
               while(str.charAt(start)==str.charAt(end)){
                   start++;
                   res--;
               }
               end--;
           }
       }
       
       return res;
    }
}