class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hmap = new HashMap<>();

        int i = 0;
     

        for(i = 0; i < nums.length; i++){
            int sum = target - nums[i];

            if(hmap.containsKey(sum)){
                return new int[]{i, hmap.get(sum)};
            }

            hmap.put(nums[i], i);
        }

        return new int[]{-1, -1};
        
    }
}