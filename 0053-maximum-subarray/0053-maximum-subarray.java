class Solution {
    public int maxSubArray(int[] nums) {


        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int i = 0;
        for(i = 0; i < nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(sum, maxSum);
        }

        if(maxSum == Integer.MIN_VALUE){
            return 0;
        }

        return maxSum;

        
        
    }
}