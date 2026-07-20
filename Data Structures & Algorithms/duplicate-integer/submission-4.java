class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hi = new HashSet<>();
        for (int number:nums){
          if(hi.add(number)== false){
            return true;
                
            }

        }
        return false;
    }
}
