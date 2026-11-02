class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> hmap = new HashMap<>();
        
        int maxLength = 0;
        int len = 0;

        int left = 0;
        int right = 0;

        while(right < s.length()){
            
           if(!hmap.containsKey(s.charAt(right))){
            hmap.put(s.charAt(right), hmap.getOrDefault(right, 0) + 1);
            right++;
           }

           else{
            hmap.remove(s.charAt(left));
            left++;
           }
           
            

           

            maxLength = Math.max(maxLength, right - left);

        }

        return maxLength;
    }
}