class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum=0;
        int evenSum=0;

        for(int i=1;i<=(2*n);i++){
            if(i%2==0) evenSum+=i;
            else oddSum+=i;
        }

        return gcd(oddSum, evenSum);
    }
        public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}