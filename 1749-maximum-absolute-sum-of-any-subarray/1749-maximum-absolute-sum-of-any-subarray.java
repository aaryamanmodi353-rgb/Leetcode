class Solution {
    public int maxAbsoluteSum(int[] nums) {

       int minSum = nums[0];
       int maxSum = nums[0];

       int ans = nums[0];
       int bestending = nums[0];

       if(nums.length == 1){
        return Math.abs(ans);
       }

       int i = 0;
       for(i = 1; i < nums.length; i++){

        int a = nums[i];
        int b = nums[i] + minSum;
        int c = nums[i] + maxSum;

        minSum = Math.min(a, b);
        maxSum = Math.max(a, c);

        bestending = Math.max(Math.abs(minSum), Math.abs(maxSum));

        ans = Math.max(Math.abs(bestending), Math.abs(ans));
          


       }

       return ans;
        
    }
}