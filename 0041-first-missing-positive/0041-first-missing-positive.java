class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int num=1;
        for(int i=0;i<n;i++){
            if(nums[i]==num){
                num++;
            }
        }
        return num;
    }
}