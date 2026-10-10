class Solution {

    public void combinations(int nums[], int sum, int index, int target, List<Integer> lst, List<List<Integer>> res){

        if(index == nums.length){
            if(sum == target){
            res.add(new ArrayList<>(lst));
            }
            return;
        }

        if(sum <= target){
            sum += nums[index];
            lst.add(nums[index]);
            combinations(nums, sum, index, target, lst, res );
            sum -= nums[index];
            lst.remove(lst.size() - 1);
        }

        combinations(nums, sum, index + 1, target, lst, res);


        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> lst = new ArrayList<>();
        
        List<List<Integer>> res = new ArrayList<>();

      
        combinations(candidates, 0, 0, target, lst, res);

        return res;

    }
}