class Solution {
    public int sumCounts(List<Integer> nums) {
        int n= nums.size();
        int sum=n;

        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            set.add(nums.get(i));
            for(int j=i+1;j<n;j++){
                set.add(nums.get(j));
                int s=set.size();
                sum=sum+(s*s);
            }
        }
        return sum;
    }
}