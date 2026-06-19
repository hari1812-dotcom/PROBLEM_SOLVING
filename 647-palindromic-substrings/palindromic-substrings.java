class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0,right = s.length()-1;
        while(left<right) {
            if(arr[left]!=arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n =s.length();
        int count = 0;
        for(int i = 0;i<n;i++) {
            String sub = "";
            for(int j=i;j<n;j++) {
                sub += s.charAt(j);
                if(isPalindrome(sub)) {
                count++;
            }
            }
            
        }
        return count;
    }
}