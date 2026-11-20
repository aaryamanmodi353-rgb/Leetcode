class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int right = 0;

        int curr = 0;

        int maxLen = 0;
        

        while(right < nums.length){

            if(nums[right] == 0){
                curr++;

            }

            while(curr > k){

                if(nums[left] == 0){
                    curr--;
                }
                left++;

            }
            
            maxLen = Math.max(right - left + 1, maxLen);
            right++;

            
        }

        return maxLen;



        
    }
}