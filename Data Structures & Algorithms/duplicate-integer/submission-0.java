class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hi = new HashSet<>();
        for (int number:nums){
            if(!hi.add(number)){
                return true;
            }
        }
        return false;
    }

    }
