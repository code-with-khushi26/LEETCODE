class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<=8){
            return n;
        }

        int cost=0;
        int c=1;
        for(int i=0;i<n;i++){
            if(i!=0 && i%8==0){
                c++;
            }
            cost+=c;
        }
        return cost;
    }
}