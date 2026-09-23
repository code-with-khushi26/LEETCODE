class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }

        int target=sum-x;
        if(target<0) return -1;
        if(target==0) return nums.length;

        int left = 0;
        sum = 0;
        int maxLen = -1;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>target && left<=i){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                maxLen=Math.max(maxLen,i-left+1);
            }
        }

        if(maxLen==-1){
            return -1;
        }

        return nums.length - maxLen;
    }
}