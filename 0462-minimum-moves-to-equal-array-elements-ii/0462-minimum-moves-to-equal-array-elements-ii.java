class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=nums[n/2];
        int moves=0;

        for(int i=0;i<n;i++){
            int k=Math.abs(mid-nums[i]);
            moves+=k;
        }
        return moves;
    }
}