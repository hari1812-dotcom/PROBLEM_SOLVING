class Solution {
    private boolean isAlphaNum(char ch) {
        return (ch>='a' && ch<='z' )||(ch>='A' && ch<='Z' )|| (ch>='0' && ch<='9'); 
    }
    public boolean isPalindrome(String s) {
       int left = 0,right = s.length()-1;
       while(left<right) {
        char l = s.charAt(left);
        char r = s.charAt(right);
        if(!isAlphaNum(l)){
            left++;
        }
        else if(!isAlphaNum(r)) {
            right--;
        }
        else {
            if(Character.toLowerCase(l)!=Character.toLowerCase(r)) {
                return false;
            }
            left++;
            right--;
        }

        } 
        return true;
    }
}