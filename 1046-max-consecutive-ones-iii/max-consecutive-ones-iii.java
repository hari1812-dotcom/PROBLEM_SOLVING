class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxlen = 0;
        int zero_count=0;
        for(int right = 0;right < nums.length;right++) {
            if(nums[right]==0) {
                zero_count++;
            }
            while(zero_count>k) {
                if(nums[left]==0) {
                    zero_count--;
                }
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}