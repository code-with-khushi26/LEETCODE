class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int map[]=new int[26];
        for(char ch:licensePlate.toCharArray()){
            if(Character.isLetter(ch)){
                map[Character.toLowerCase(ch)-'a']++;
            }
        }
        String ans="";
        for(String word:words){
            int[] freq=new int[26];

            for(char ch:word.toCharArray()){
                freq[ch-'a']++;
            }

            boolean ok=true;
            for(int i=0;i<26;i++){
                if(freq[i]<map[i]){
                    ok=false;
                    break;
                }
            }

            if(ok){
                if(ans.equals("")||word.length()<ans.length()){
                    ans=word;
                }
            }
        }

        return ans;
    }
}