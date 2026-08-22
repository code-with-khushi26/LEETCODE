class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int total=0;
        int temp=n;

        while(temp>0){
            int ld=temp%10;
            sum+=ld;
            prod*=ld;
            temp/=10;
        }
        total=sum+prod;

        if(n%total==0){
            return true;
        }
        return false;
    }
}