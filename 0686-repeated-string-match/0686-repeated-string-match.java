class Solution {
    public int repeatedStringMatch(String a, String b) {
        String c=a;
        int ans=1;
        while(c.length()<b.length()){
            c+=a;
            ans++;
        }
        if(c.contains(b)) return ans;
        c+=a;
        if(c.contains(b)) return ans+1;
        return -1;
    }
}