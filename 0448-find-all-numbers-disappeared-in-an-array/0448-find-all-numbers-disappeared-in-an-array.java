class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];

        for(int num:nums){
            arr[num-1]=1;
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]!=1) list.add(i+1);
        }
        return list;
    }
}