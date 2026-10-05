class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(0);
            }

            else{
                int i=st.pop();
                int score;
                if(i==0){
                    score=1;   
                }
                else{
                    score=2*i; 
                }

                st.push(st.pop()+score);
            }
        }
        return st.pop();
    }
}