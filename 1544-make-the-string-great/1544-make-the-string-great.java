class Solution {
    public String makeGood(String s) {
        int n=s.length();
        if(n==1) return s;
        Stack<Character> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }

            else{
            char top=st.peek();
            int diff=(int) Math.abs(ch-top);

            if(diff!=32){
                st.push(ch);
            }

            else{
                st.pop();
            }
            }

        }

        StringBuilder sb=new StringBuilder();
        if(st.isEmpty()) return "";
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}