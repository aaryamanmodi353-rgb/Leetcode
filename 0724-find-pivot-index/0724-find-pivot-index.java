class Solution {
    public int pivotIndex(int[] nums) {

        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        prefix[0] = 0;
        suffix[nums.length - 1] = 0;

        int i = 0;
        for(i = 1; i < nums.length; i++){

            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        for(int j = nums.length - 2; j >= 0; j--){

            suffix[j] = suffix[j + 1] + nums[j + 1]; 
        } 

        for(i = 0; i < nums.length; i++){

            if(prefix[i] == suffix[i]){
                return i;
            }
        }

        return -1;
     
        
    }
}