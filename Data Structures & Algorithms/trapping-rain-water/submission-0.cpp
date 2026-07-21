class Solution {
public:
int trap(vector<int>& a) {
    if(a.size()==0)
        return 0;
	int n = a.size();
	int w = 0;
	vector<int>l(n, 0);
	vector<int>r(n, 0);
	l[0] = a[0];
	r[n - 1] = a[n - 1];
	for (int i = 1; i < n; i++)
		l[i] = max(l[i - 1], a[i]);
	for (int i = n - 2; i >= 0; i--)
		r[i] = max(r[i + 1], a[i]);

	for (int i = 0; i < n; i++)
		w += min(l[i], r[i]) - a[i];
	return w;
}
};