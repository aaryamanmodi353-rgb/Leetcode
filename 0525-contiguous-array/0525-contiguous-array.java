class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        int x = 0;
        int y = 0;

        int sum = 0;
        int res = 0;

        int i = 0;
        for(i = 0; i < nums.length; i++){
            
            if(nums[i] == 0){
                x++;
            }
            else{
                y++;
            }

            int diff = x - y;
            if(diff == 0){

                res = Math.max(i + 1, res);

            }

            else{
                
                if(!hmap.containsKey(diff)){

                    hmap.put(diff, i);

                }
                else{

                    int val = hmap.get(diff);
                    res = Math.max(i - val, res);

                }
            }
        }

        return res;
    }
}