class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>majority=new ArrayList<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);

            if(map.get(n)==(nums.length/3)+1){
                majority.add(n);
            }
        }
        return majority;
    }
}