class Solution {
    public boolean valid(char s){
        if((s>='a'&& s<='z') || (s>='0'&& s<='9')) return true;
        return false;
    }
    public boolean isPalindrome(String s) {
      int n= s.length()-1;
       s= s.toLowerCase();
        int left = 0, right=n;
        while(left<right){
          char  start=s.charAt(right);
           char end=s.charAt(left);
            if(start==' ' || !valid(start)){
                 right--;
            } 
           else if(end == ' ' || !valid(end)){
                left++;
            }else{
                if(start==end){
                    left++;
                     right--;
                }else{
                    
                return false;
            }
            
           
        }
    }
    return true;
    }
}