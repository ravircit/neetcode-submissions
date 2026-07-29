class Solution {
    public int lastStoneWeight(int[] s) {
		PriorityQueue<Integer>q=new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < s.length; i++) {
			q.add(s[i]);
		}
		while (q.size()!=1)
		{
			int n=q.poll();
			int m=q.poll();
			q.add(n-m);
		}
		return q.peek();
	}
}