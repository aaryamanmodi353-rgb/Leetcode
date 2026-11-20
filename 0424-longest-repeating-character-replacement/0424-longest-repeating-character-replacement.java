class Solution {
    public int characterReplacement(String s, int k) {

    

        int left = 0;
        int right = 0;

        int maxLen = 0;
        int maxFreq = 0;

        int arr[] = new int[26];
        while(right < s.length()){

            int val = s.charAt(right) - 'A';
            
            arr[val]++;

            maxFreq = Math.max(arr[val], maxFreq);

            if(maxLen - maxFreq + 1 > k){

                 val = s.charAt(left) - 'A';
                arr[val]--;
                left++;
                
        
            }

            maxLen = Math.max(right - left + 1, maxLen);
            right++;
            

            
        }

        return maxLen;
        
    }
}