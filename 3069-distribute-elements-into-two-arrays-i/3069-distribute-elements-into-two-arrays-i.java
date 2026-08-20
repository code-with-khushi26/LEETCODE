class Solution {
    public int[] resultArray(int[] nums) {
        int[] result=new int[nums.length];
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }

            else{
                arr2.add(nums[i]);
            }

        }

        int j=0;
        for(int n:arr1){
            result[j++]=n;
        }

        for(int n:arr2){
            result[j++]=n;
        }

        return result;
    }
}