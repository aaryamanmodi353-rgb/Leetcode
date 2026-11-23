class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0, 1);

        int sum = 0;
        int freq = 0;
        
        int res = 0;


        int i = 0;
        for(i = 0; i < nums.length; i++){
            freq = 0;
            sum += nums[i];
            if(hmap.containsKey(sum - k)){
                freq = hmap.get(sum - k);
            }

            res += freq;
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }

        return res;

        
    
    }
}