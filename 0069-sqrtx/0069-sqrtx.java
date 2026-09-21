class Solution {
    public int mySqrt(int x) {
        int l=1;
        int r=x/2;

        if(x<2)return x;

        while(l<=r){
            int mid=(l+r)/2;
            if((long)mid*mid==x){
                return mid;
            }
            else if((long)mid*mid<x){
                l=mid+1;
            }
            else r=mid-1;
        }
        return r;
    }
}