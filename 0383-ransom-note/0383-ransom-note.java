class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        if(ransomNote.length()>magazine.length()){
            return false;
        }

        for(char ch:ransomNote.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:magazine.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(Character key:map1.keySet()){
            if(!map2.containsKey(key)){
                return false;
            }

            else if(map1.get(key)>map2.get(key)){
                return false;
            }
        }
        return true;
    }
}