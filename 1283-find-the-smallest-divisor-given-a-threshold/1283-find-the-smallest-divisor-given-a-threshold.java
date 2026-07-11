class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=Arrays.stream(nums).max().getAsInt();;

        while(l<=r){
            int mid=(l+r)/2;
            int sum=0;
            for(int n:nums){
                sum+=(n+mid-1)/mid;
            }

            if(sum<=threshold){
                r=mid-1;
            }

            else{
                l=mid+1;
            }
        }
        return l;
    }
}