class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ans[]=new int[arr.length];
        int sorted[] = Arrays.stream(arr).sorted().toArray();
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<sorted.length;i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i], rank);
                rank++;
                }          
        }

        for(int i=0;i<arr.length;i++) {
            ans[i] = map.get(arr[i]);
            }
    return ans;
    }
}