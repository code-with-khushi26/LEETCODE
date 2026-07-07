class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long x=0;
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='0'){
                sb.append(ch);
                sum+=ch-'0';
            }
        }
         if(sb.length()==0){ 
            return 0;
        }
        x=Long.parseLong(sb.toString());
        return x*sum;
    }
}