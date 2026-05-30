class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // m * n time complexity ? so need to write helper that checks if two strings are anagrams of each other (freq map should be good enough)
        // now need to think of a way that groups maybe like as i iterate through, make a hashmap where its like string,LIst<String> okay if it's not, check if it's within the key and if it not add it 
        // returns a List<List<String>> 
        // so if any of the existing keys are 
        HashMap<String,List<String>> result = new HashMap<>();
        for(String string:strs){
            // if there exists a key that is an anagram of string, get the key. Arraylist get and then add it to the arraylist. else create
            //i'm basically overriding the hashcode no ?
            String key = anagramKey(string);
            if(result.containsKey(key)){
                List<String> bucket = result.get(key);
                bucket.add(string);
            }
            else{
                List<String> add = new ArrayList<>();
                add.add(string);
                result.put(key,add);
            }
            
        }
        
        List<List<String>> overarch = new ArrayList<>(result.values());
        return overarch;}

    public String anagramKey(String hi){
                int[] freq = new int[26];
                StringBuilder him = new StringBuilder();
                for(char c:hi.toCharArray()){
                    int temp = c - 'a';
                    freq[temp]++;
                }
                for (int i = 0;i<freq.length;i++){
                    char charVal = (char) ('a' + i);
                    while (freq[i] > 0){
                        him.append(charVal);
                        freq[i]--;
                    }

                }
                return him.toString();
            }
        }

