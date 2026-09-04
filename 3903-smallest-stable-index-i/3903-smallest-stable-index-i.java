class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int idx=-1;

        int minArr[]=new int[n];
        minArr[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--){
            minArr[i]=Math.min(nums[i],minArr[i+1]);
        }

        int max=0;

        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);

            if(max-minArr[i]<=k){
                return i;
            }
        }
        return idx;
    }
}