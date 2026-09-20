class Solution {
    public int reverseDegree(String s) {
        int i=1;
        int sum=0;
        for(char ch : s.toCharArray()){
            int c=27-(ch-'a'+1);
            int prod=c*i;
            sum+=prod;
            i++;
        }
        return sum;
    }
}