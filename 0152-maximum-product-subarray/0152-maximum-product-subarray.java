class Solution {
    public int maxProduct(int[] nums) {

        int minProduct = nums[0];
        int maxProduct = nums[0];

        int ans = nums[0];

        int i = 0;
        for(i = 1; i < nums.length; i++){

            int a = nums[i];
            int b = nums[i] * minProduct;
            int c = nums[i] * maxProduct;

            minProduct = Math.min(a, Math.min(b, c));
            maxProduct = Math.max(a, Math.max(b, c));

            ans = Math.max(Math.max(minProduct, maxProduct), ans);


        }

        return ans;
        
    }
}