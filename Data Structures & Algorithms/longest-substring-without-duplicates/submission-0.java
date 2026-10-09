class Solution {
      public int lengthOfLongestSubstring(String s) {
        //Input: s = "abcabdcbb" ==> abdc
        Set<Character> set = new HashSet<>();
        int max = 0, start = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(i));
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
