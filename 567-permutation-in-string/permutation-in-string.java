class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        int left = 0;

        for(int right = 0; right < m; right++) {

            freq2[s2.charAt(right) - 'a']++;

            if(right - left + 1 > n) {
                freq2[s2.charAt(left) - 'a']--; // Fixed
                left++;
            }

            if(right - left + 1 == n) {
                boolean isMatch = true;

                for(int i = 0; i < 26; i++) {
                    if(freq1[i] != freq2[i]) {
                        isMatch = false;
                        break;
                    }
                }

                if(isMatch) return true;
            }
        }

        return false;
    }
}