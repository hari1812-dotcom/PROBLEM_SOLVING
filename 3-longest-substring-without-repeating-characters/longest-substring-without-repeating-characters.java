class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxlen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int r=0;r<n;r++) {
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c) > 1) {
                char leftchar = s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            maxlen = Math.max(maxlen,r-left+1);
        }
        return maxlen;
    }
}