class Solution {
    public int pivotIndex(int[] nums) {
        
      int left = 0;
      int right = 0;
      
      int sum = 0;

      int i = 0;
      for(i = 0; i < nums.length; i++){
        
        sum += nums[i];
      }

       for(i = 0; i < nums.length; i++){
        if(i  != 0){
            left += nums[i - 1];
        }

        right =  sum - (left + nums[i]);

        if(left == right){
            return i;
        }
        
       }

       return -1;
        
    }
}