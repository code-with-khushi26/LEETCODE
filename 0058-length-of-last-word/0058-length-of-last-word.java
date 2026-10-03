class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
         while (n>0 && s.charAt(n-1) == ' ') {
            n--;
        }
        while(n>0 && s.charAt(n-1)!=' '){
            count++;
            n--;
        }
        return count;
    }
}