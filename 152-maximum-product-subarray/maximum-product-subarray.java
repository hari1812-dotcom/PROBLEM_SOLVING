class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max_Product = -10;
        for(int i=0;i<n;i++) {
            int product = 1;
            for(int j=i;j<n;j++) {
                product*=nums[j];
                max_Product = Math.max(max_Product,product);
            }
        }
        return max_Product;
    }
}