class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int arr[]=new int[n];
        int d=0;
        for(int i=0;i<n;i++){
            if(seq.charAt(i)=='('){
                d++;
                arr[i]=d%2;
            }

            else{
                arr[i]=d%2;
                d--;
            }
        }
        return arr;
    }
}