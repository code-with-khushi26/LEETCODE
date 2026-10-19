class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        int l=0;
        int c=0;

        for(int n:nums){
            if(n<target) l++;
            if (n==target) c++;
        }

        for(int i=0;i<c;i++){
            list.add(l+i);
        }
        return list;
    }
}