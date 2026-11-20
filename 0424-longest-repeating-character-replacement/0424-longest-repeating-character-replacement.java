class Solution {
    public int characterReplacement(String s, int k) {
       int l = 0,r = 0;
       int hash[] = new int[26];
       int res = 0, max = 0;
       while(r<s.length()) {
           char c = s.charAt(r);
           hash[c-'A']++;
           max = Math.max(max, hash[c-'A']);
           if((r-l+1)-max >k) {
            hash[s.charAt(l)-'A']--;
            l++;
           } else {
            res = Math.max(res, (r-l+1));
           }
           r++;
       }
       return res;
    }

}