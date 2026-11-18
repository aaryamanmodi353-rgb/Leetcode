class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int arr[] = new int[nums.length];

        int m = nums.length - 1;

        while(left <= right){

            int sqleft = nums[left] * nums[left];
            int sqright = nums[right] * nums[right];

            if(sqleft > sqright){

                arr[m] = sqleft;
                left++;
                m--;

            }

            else{
                arr[m] = sqright;
                right--;
                m--;
            }

            
     }

     return arr;
        
        
    }
}