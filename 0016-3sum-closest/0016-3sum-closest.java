class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int sum = 0;

        int closest = Integer.MAX_VALUE;
        
       int i = 0;
       for(i = 0; i < nums.length - 2; i++){
           
           if(i > 0 && nums[i] == nums[i - 1]){ 
             continue;
           }
           
           int j = i + 1;
           int k = nums.length - 1;

           while(j < k){
        
            int tempSum = nums[i] + nums[j] + nums[k];
            if(tempSum == target){
                
                closest = 0;

                sum = tempSum;

                break;
            }

            else if(tempSum < target){
                
                int diff = target - tempSum;
                if(closest > Math.abs(diff)){
                    closest = Math.abs(diff);
                    sum = tempSum;
                    
                }
                j++;

            }
            else{
                int diff = target - tempSum;
                if(closest > Math.abs(diff)){
                    closest = Math.abs(diff);
                    sum = tempSum;
                    
                }
                k--;
            }
           }

           
       }

       return sum;
    }
}