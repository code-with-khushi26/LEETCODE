class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int closest_sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int curr_sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-curr_sum)<Math.abs(target-closest_sum)){
                    closest_sum=curr_sum;
                }
                if(curr_sum<target) left++;
                else if(curr_sum>target) right--;
                else return curr_sum;
            }
        }
        return closest_sum;

    }
}