class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> hmap = new HashMap<>();

        int i = 0;
        for(i = 0; i < s.length(); i++){
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);

        }

        for(i = 0; i < t.length(); i++){
            
            if(!hmap.containsKey(t.charAt(i))){
                return false;
            }
            

            int val = hmap.get(t.charAt(i));
            val--;

            if(val == 0){
                hmap.remove(t.charAt(i));
            }
            else{
                hmap.put(t.charAt(i), val);
            }
        }
        
        return hmap.size() == 0;
        
    }
}