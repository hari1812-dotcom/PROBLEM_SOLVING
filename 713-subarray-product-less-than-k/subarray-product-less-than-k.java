class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0;
        int count = 0;
        long product = 1;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            // Shrink window if product >= k
            while (product >= k) {
                product /= nums[left];
                left++;
            }

            // Number of valid subarrays ending at right
            count += (right - left + 1);
        }

        return count;
    }
}