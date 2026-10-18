class Solution {
    public int[] dailyTemperatures(int[]nums) {
        int n=nums.length;
        int result[]=new int[n];
        Arrays.fill(result,0);
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                int idx=st.pop();
                result[idx]=i-idx;
            }
            st.push(i);
        }
        return result;
    }
}