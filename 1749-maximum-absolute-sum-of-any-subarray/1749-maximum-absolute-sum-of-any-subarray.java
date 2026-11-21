class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int minAdd = nums[0];
        int maxAdd = nums[0];
        

        int bestending = nums[0];

        int ans = nums[0];

        if(nums.length == 1){
        return Math.abs(ans);
        }


 
        int i = 0;
        for(i = 1; i < nums.length; i++){
            int a = nums[i];
            int b = nums[i] + maxAdd;
            int c = nums[i] + minAdd;

            minAdd = Math.min(a, c);
            maxAdd = Math.max(a, b);

            bestending = Math.max(Math.abs(minAdd), Math.abs(maxAdd));

            ans = Math.max(Math.abs(bestending), Math.abs(ans));
            
          

            
        }
        

        return ans;
    }
}