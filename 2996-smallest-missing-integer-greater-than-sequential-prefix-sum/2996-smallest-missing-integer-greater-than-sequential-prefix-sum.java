class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        int x=sum;

        while(true){
            boolean found=false;
            for(int n:nums){
                if(n==x){
                    found=true;
                    break;
                }
            }
            if(!found){
                break;
            }
            x++;
        }
        return x;
    }
}