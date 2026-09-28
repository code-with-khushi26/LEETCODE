class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxd=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                depth++;
                maxd=Math.max(depth,maxd);
            }
            else if(ch==')'){
                depth--;
            }
            
        }
        return maxd;
    }
}