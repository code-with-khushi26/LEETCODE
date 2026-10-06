class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList <Integer> list=new ArrayList<>();
        long n=1;
        for(int i=0;i<=rowIndex;i++){
            list.add((int)n);
            n=n*(rowIndex-i)/(i+1);
        }
        return list;
    }
}