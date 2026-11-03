class Solution {
    public void moveZeroes(int[] nums) {


        int pos = 0;
        int i = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[pos++] = nums[i];
            }
        }

        for(i = pos; i < nums.length; i++){
            nums[i] = 0;
        }
        
       

        
    }
}