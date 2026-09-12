class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int ans=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int count=1;
                int curr=n;
                while(set.contains(curr+1)){
                    count++;
                    curr++;

                }
            ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}