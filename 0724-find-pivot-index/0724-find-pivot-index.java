class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        int l=0;

        for(int num:nums){
            sum+=num;
        }

        for(int i=0;i<n;i++){
            int r= sum-l-nums[i];
            if(l==r) return i;
            l+=nums[i];
        }
        return -1;
    }
}