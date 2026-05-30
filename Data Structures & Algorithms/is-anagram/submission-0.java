class Solution {
    public boolean isAnagram(String s, String t) {
        // checking if they are basically can you create the other word 
        int[] urmom = new int[26]; 

        for (char c:s.toCharArray()){
            int temp = c-'a';
            urmom[temp]++;
        }
        for (char c:t.toCharArray()){
            int him = c - 'a';
            urmom[him]--;
        }
        for (int number:urmom){
            if(number!=0){
                return false;
            }
        }
        return true;
    }
    
}
