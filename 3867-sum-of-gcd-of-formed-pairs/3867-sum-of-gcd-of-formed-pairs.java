class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefixGcd[]=new int[n];
        int mx=nums[0];

        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(nums[i],mx);
        }

        Arrays.sort(prefixGcd);
        long sum=0;
        int l=0;
        int r=n-1;
        while(l<r){
            sum+=gcd(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
        }

        return sum;
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