class Solution {

    public boolean isValid(String s) {
        // Write your code here
        boolean found=false;
        int number=0;
        int budha=1;
        int total=0;
        for(int i=s.length()-1;i>=0;i--){
            int num=s.charAt(i)-48;
            if(num>=0&&num<=9){
                if(found&&(num==0)) return false;
                if(!found) found=true;
                number+=(num*budha);
                budha*=10;
                
            }
            else{
                if(number<=255&&number>=0&&found){
                    total++;
                    budha=1;
                    found=false;
                    number=0;
                }
                else return false;
            }
        }
        if(number<=255&&number>=0&&found){
            total++;
            budha=1;
            number=0;
        }
        
        if(total==4) return true;
        else return false;
    }
}