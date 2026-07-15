class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum=0;
        int evenSum=0;

        if(n==1){
            return 1;
        }

        for(int i=1;i<=(2*n);i++){
            if(i%2==0) evenSum+=i;
            else oddSum+=i;
        }
        int ans=0;
        for(int i=2;i<=Math.min(oddSum,evenSum);i++){
            if(oddSum%i==0 && evenSum%i==0){
                ans=i;
            }
        }
        return ans;
    }
}