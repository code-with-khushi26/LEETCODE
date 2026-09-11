class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        if(n<3) return 0;

        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if(j==i) continue;
                for(int k=0;k<n;k++){
                    if(k==i || k==j) continue;
                    if(digits[k]%2!=0) continue;

                    int num=digits[i]*100+digits[j]*10+digits[k];
                    set.add(num);
                }
            }
        }
        return set.size();
    }
}