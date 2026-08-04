class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];

        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);    
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