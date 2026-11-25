class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> hmap = new HashMap<>();

        
        int sum = 0;
        int res = 0;



        int i = 0;
        for(i = 0; i < nums.length; i++){

            sum = ((sum + nums[i]) % k + k) % k;

            if(sum == 0){

                res += 1;

            }

            res += hmap.getOrDefault(sum, 0);
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }

        return res;
        
    }
}