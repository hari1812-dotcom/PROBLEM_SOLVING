class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxarea = 0;
        int left = 0,right = n-1;
        while(left < right) {
            int h = Math.min(height[left],height[right]); 
            int weight = right - left;
            int area = h * weight;
            maxarea = Math.max(area,maxarea);
            if(height[left] < height[right]) {
                left++;
            }
            else  {
                right--;
            }
            }
            return maxarea;
        }
        
}
