class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int nums2[]=new int[n];

        int odd=0;
        int even=0;

        for(int x:nums1){
            if(x%2==0){
                even++;
            }

            else odd++;
        }

        if(n==even || n==odd || odd==even) return true;

        return true;
        
    }
}