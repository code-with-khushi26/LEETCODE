class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int map[]=new int[26];
        for(char ch:word.toCharArray()){
            map[ch-'a']++;
        }
        Arrays.sort(map);
        
        int count=0;
        for(int i=0;i<26;i++){
            count+=map[25-i]*(i/8+1);
        }
        return count;

    }
}