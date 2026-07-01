class Solution {
    public String largestOddNumber(String num) {
        String s="";
         for(int i=num.length()-1;i>=0;i--) {
            if((num.charAt(i)-'0')%2!=0) {
                s= num.substring(0,i+1);
                break;
            }
        }
        return s;
    }
}