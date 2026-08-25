class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int m=k;
        while(set.contains(m)){
              m+=k;
              }
        return m;          
    }
}