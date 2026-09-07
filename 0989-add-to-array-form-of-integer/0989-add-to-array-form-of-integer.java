class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        int carry=0;
        int i=nums.length-1;
        while(k>0 || i>=0 || carry>0){
            int sum=0;
            int d=0;
            if(i>=0) d=nums[i];
            else d=0;

            sum=d+carry+(k%10);
            ans.add(sum%10);
            carry=sum/10;
            k/=10;
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
}