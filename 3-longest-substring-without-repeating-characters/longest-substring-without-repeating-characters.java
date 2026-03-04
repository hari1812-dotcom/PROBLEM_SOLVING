class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int start=0;
        int maxlen = 0;
        for(int end = 0;end<s.length();end++) {
            char ch = s.charAt(end);
            freq[ch]++;
            while(freq[ch]>1) {
                 char left = s.charAt(start);
                 freq[left]--;
                 start++;
            }  
            int len = end-start+1;
            if(len>maxlen) {
                maxlen = len;
            }
        }
        return maxlen;
    }
}