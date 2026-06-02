class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force is n ^2
        // maybe i could group the possible 
        // in terms of a math equation ? well target mod 7 
        // well maybe in terms of what target is ? like if target is 2k or 2k + 1
        // find otu what k is 
        // so, iterate through nums until you find k. 
        // add each to a hashtable, 
        // assumable that each input has a pair of i and j taht satisfy meaning, there will alway sbe a k, and a k + 1 
        // so find k first - iterate through to find k, and since you can assume j will always be k + 1 so like a contains
        //frequency map instead ? or no it was complement - which means 
        // create array of complements. 
        Map<Integer,Integer> hash = new TreeMap<>();
        // cant be a treemap because it needs to work if there is more of the same numer
        //if current is a complement, then the index of result[1] becomes itself. 
        Set<Integer>hashes = new HashSet<>();
        int[] result = new int[2];
        for(int i = 0;i < nums.length;i++){
            int complement = target - nums[i];
            hashes.add(complement);
            if(!hash.containsKey(nums[i])){
                hash.put(nums[i],i);
            }

            if(hashes.contains(nums[i])){
                result[1] = i;
                int b = hash.get(target - nums[i]);
                result[0] = b;             }

        }
        return result;
    }
}
