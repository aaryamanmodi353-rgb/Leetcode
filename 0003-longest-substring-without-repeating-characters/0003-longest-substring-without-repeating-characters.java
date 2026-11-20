class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> hmap = new HashMap<>();

        int left = 0;
        int right = 0;

        int maxLen = 0;

        while(right < s.length()){

            if(!hmap.containsKey(s.charAt(right))){
                hmap.put(s.charAt(right), hmap.getOrDefault(s.charAt(right), 0) + 1);
                 right++;
            }

            else{
                hmap.remove(s.charAt(left));
                left++;
            }

           

            maxLen = Math.max(right - left, maxLen);

        }

        return maxLen;
        
    }
}