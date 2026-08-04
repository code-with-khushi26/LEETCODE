class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];

        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n); 
            max=Math.max(max,n);
            min=Math.min(min,n);

        }
        List<Integer> ans=new ArrayList<>();
        while(min<=max){
            if(!set.contains(min)){
                ans.add(min);
            }
            min++;
        }
        return ans;
    }
}