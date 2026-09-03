class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap map1=new HashMap<>();
        HashMap map2=new HashMap<>();

        
        String st[]=s.split(" ");

        if(pattern.length()!=st.length){
            return false;
        }
        
        for(int i=0;i<pattern.length();i++){
            char a=pattern.charAt(i);
            String b=st[i];

            if(map1.containsKey(a) && !map1.get(a).equals(b)){
                return false;
            }

            if(map2.containsKey(b) && !map2.get(b).equals(a)){
                return false;
            }

            map1.put(a,b);
            map2.put(b,a);
        }
        

        return true;
    }
}