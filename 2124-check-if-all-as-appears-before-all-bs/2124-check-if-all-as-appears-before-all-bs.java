class Solution {
    public boolean checkString(String str) {
        if (str == null) return true;
    
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return str.equals(new String(chars));
    }
}