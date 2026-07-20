class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> ht = new HashMap<>();
        for (char c : s.toCharArray()) {
            ht.put(c ,ht.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            ht.put(c, ht.getOrDefault(c,0)-1);
        }
        for (int count : ht.values()) {
            if (count != 0) {
                return false;
            }
        }
       return true; 
    }  
}
