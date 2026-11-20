class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int right = 0;

        int sum = 0;

        int maxLen = Integer.MAX_VALUE;

        while(right < nums.length){
            sum += nums[right];
            
            

            while(sum >= target){
                maxLen = Math.min(right - left + 1, maxLen);
                sum -= nums[left];
                left++;

            }

            right++;
            

            
            

        }

        return maxLen == Integer.MAX_VALUE ? 0 : maxLen;
        
    }
}