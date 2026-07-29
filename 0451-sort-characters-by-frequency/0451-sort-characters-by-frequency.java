class Solution {
    public String frequencySort(String s) {
        StringBuilder sb= new StringBuilder();
        HashMap <Character,Integer> map=new HashMap<>();
         for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
         }

         List<Character> list = new ArrayList<>(map.keySet());
         list.sort((a,b)->map.get(b)-map.get(a));

         for(char ch:list){
            int n=map.get(ch);
            for(int i=0;i<n;i++){
                sb.append(ch);
            }
         }
         return sb.toString();
    }
}