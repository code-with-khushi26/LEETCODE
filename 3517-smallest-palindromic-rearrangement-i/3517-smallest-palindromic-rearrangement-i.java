class Solution {
    public String smallestPalindrome(String s) {
        if (s.length()==1){
            return s;
        }

        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder l=new StringBuilder();
        char mid=0;

        for(char ch='a';ch<='z';ch++){
            if(map.containsKey(ch)){
                int freq=map.get(ch);

            for(int i=0;i<freq/2;i++){
                l.append(ch);
            }

            if(freq%2!=0){
                mid=ch;
            }
        }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(l);
        if(mid!=0) sb.append(mid);
        sb.append(new StringBuilder(l).reverse());
        return sb.toString();
    }
}