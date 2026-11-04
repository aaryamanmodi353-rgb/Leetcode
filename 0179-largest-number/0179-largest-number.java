class Solution {
    public String largestNumber(int[] nums) {
        
        String[] st = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            st[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(st, (a, b) -> (b + a).compareTo(a + b));

      
        if (st[0].equals("0")) {
            return "0";
        }

      
        StringBuilder largestNum = new StringBuilder();
        for (String numStr : st) {
            largestNum.append(numStr);
        }

        return largestNum.toString();
        
    }
}