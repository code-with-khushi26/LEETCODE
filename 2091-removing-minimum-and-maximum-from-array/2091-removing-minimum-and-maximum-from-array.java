class Solution {
    public int minimumDeletions(int[] nums) {
       int n=nums.length;

       if(n==1){
        return 1;
       } 

       int mini=0;
       int maxi=0;

       for(int i=1;i<n;i++){
        if(nums[i]>nums[maxi]){
            maxi=i;
        }
        if(nums[i]<nums[mini]){
            mini=i;
        }

       }

       int ans=0;
       int l=Math.min(mini,maxi);
       int r=Math.max(mini,maxi);

       int front=r+1;
       int back=n-l;
       int both=(l+1)+(n-r);

       ans=Math.min(both,Math.min(front,back));
       return ans;

    }
}