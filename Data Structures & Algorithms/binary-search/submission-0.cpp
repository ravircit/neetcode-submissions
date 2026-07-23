class Solution {
public:
        int search(vector<int>& v, int t) {
        int l=0,r=v.size()-1,m;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(v[m]==t)
                return m;
            else if(v[m]<t)
                l=m+1;
            else
                r=m-1;
        }
        return -1;
    }
};