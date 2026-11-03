class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int n=nums.length;
        int moves=0;

        for(int i=1;i<n;i++){
            if(nums[i]>max) max=nums[i];
        }

        for(int i=0;i<n;i++){
            int k=Math.abs(nums[i]-max);
            moves+=k;
        }
        return moves;
    }
}