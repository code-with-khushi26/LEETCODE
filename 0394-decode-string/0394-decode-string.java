class Solution {
    public String decodeString(String s) {
        int k=0;
        Stack<Integer> num=new Stack<>();
        Stack<String> str=new Stack<>();
        StringBuilder curr= new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
               k=k*10+(ch-'0');
            }
            else if(ch=='['){
                num.push(k);
                str.push(curr.toString());

                k=0;
                curr.setLength(0);
            }

            else if(ch==']'){
                String a=str.pop();
                int n=num.pop();
                String result=curr.toString().repeat(n);
                curr=new StringBuilder(a+result);
            }
            else {
                curr.append(ch);
            }
        }
        return curr.toString();

    }
}