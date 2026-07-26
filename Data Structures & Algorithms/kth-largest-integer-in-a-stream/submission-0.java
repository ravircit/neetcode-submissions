class KthLargest {
    PriorityQueue<Integer> pq;
int t;
    public KthLargest(int k, int[] nums) {
        t=k;
        pq = new PriorityQueue(k);
        int i = 0;
        while (k-- > 0 && i<nums.length) {
            pq.add(nums[i]);
            i++;
        }
        while (i < nums.length) {
            if (nums[i] >= pq.peek()) {
                pq.poll();
                pq.add(nums[i]);
            }
            i++;
        }
    }

    public int add(int val) {

            pq.add(val);
        if (pq.size() > t) {
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */