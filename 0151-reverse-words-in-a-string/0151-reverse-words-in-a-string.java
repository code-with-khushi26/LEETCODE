class Solution {
    public String reverseWords(String s) {
        String st=s.trim();
        StringBuilder sb=new StringBuilder();
        String words[]=st.split("\\s+");
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
}
}