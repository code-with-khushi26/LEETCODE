class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        Arrays.fill(result,-1);
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<2*n;i++){
            int curr=i%n;
            while(!st.isEmpty() && nums[curr]>nums[st.peek()]){
                int idx=st.pop();
                result[idx]=nums[curr];
            }
            st.push(curr);
        }
        return result;
    }
}