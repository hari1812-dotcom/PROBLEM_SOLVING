class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxavg = -1e9;
        for(int i=0;i<=n-k;i++) {
            int sum=0;
            for(int j=i;j<i+k;j++) {
                sum+=nums[j];
            }
            double avg = (double)sum/k;
            maxavg = Math.max(maxavg,avg);
        }
        return maxavg;
}
}