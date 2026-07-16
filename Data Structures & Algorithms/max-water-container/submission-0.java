class Solution {
     public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int a = 0, ma = 0;
        while (left < right) {
            a = (right - left) * Math.min(heights[left], heights[right]);
            if (ma < a) ma = a;
            if (heights[left] < heights[right]) left++;
            else right--;
        }
        return ma;
    }
}
