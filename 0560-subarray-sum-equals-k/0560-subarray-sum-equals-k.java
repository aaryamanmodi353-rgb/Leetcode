class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hmap = new HashMap<>();

        hmap.put(0, 1);

        int sum = 0;
        int res = 0;

        int i = 0;
        for(i = 0; i < nums.length; i++){
            
            sum += nums[i];
            int diff = sum - k;

            if(hmap.containsKey(diff)){
                res += hmap.get(diff);
            }

            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
            


          
        }
        
        return res;
    }
}