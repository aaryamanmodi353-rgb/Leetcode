class Solution {


    public void swap(int nums[], int x, int y){
        
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

        return;
    }
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){

            if(nums[mid] == 0){
                if(low == mid){
                low++;
                mid++;
                continue;
                }
                else{
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    continue;
                }
            }

            if(nums[mid] == 1){
                mid++;
                continue;
            }

            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
                continue;
            }


            
        }

        
    
        
    }
}