class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> hmap = new HashMap<>();

        int left = 0;
        int right = 0;

        int maxLen = 0;

        while(right < fruits.length){

            hmap.put(fruits[right], hmap.getOrDefault(fruits[right], 0) + 1);

            while(hmap.size() > 2){
                int val = hmap.get(fruits[left]);
                val--;

                if(val == 0){
                    hmap.remove(fruits[left]);
                    
                }
                else{
                    hmap.put(fruits[left], val);
                }

                left++;
            }

            
                maxLen = Math.max(right - left + 1, maxLen);

            
            right++;
        }

        return maxLen;
        
    }
}