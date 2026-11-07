class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = nums[0];

        int i = 0;
        for(i = 0; i < nums.length; i++){
            
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
            
        }

      return maxSum;
        
    }
}