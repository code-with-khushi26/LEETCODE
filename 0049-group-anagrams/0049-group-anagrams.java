class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String value=new String(arr);

            if(map.containsKey(value)){
                map.get(value).add(s);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(value, list);
            }
            
        }
        ans.addAll(map.values());
        return ans;
    }
}