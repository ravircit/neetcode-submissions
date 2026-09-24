class Solution {
    public int longestConsecutive(int[] nums) {
                int l=0,m=0;
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < nums.length; i++) {
                        set.add(nums[i]);
                }
                for (int i = 0; i < nums.length; i++) {
                        if(!set.contains(nums[i] - 1)) {
                               l=1;
                               int j= nums[i] + 1;
                               while (set.contains(j)) {
                                       j++;
                                       l++;
                               }
                               m=Integer.max(l,m);
                        }
                }
                return m;
        }
}
