class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hmap = new HashMap<>();

        int i = 0;
        for(i = 0; i < nums.length; i++){
            
            if(hmap.containsKey(target - nums[i])){

                return new int[]{i, hmap.get(target - nums[i])};
            }

            hmap.put(nums[i], i);
        }


        return new int[]{0, 0};


     
        
           
    }
}