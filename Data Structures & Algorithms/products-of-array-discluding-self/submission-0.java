class Solution {
    public int[] productExceptSelf(int[] nums) {
int mul=1;
int []ans=new int[nums.length];
//ans[0]=nums[0];
    mul=nums[0];
    for (int i = 1; i < nums.length; i++) {
        ans[i]=mul;
       mul=mul*nums[i];
    }
    mul=nums[nums.length-1];
    for (int i = nums.length-2; i >0 ; i--) {
        ans[i]=ans[i]*mul;
        mul=nums[i]*mul;
    }
    ans[0]=mul;
    return ans;
}
}