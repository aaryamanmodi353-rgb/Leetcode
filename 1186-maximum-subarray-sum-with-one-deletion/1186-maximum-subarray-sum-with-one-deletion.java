class Solution {
    public int maximumSum(int[] arr) {
        
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;

        int ans = arr[0];

        int i = 0;
        for(i = 1; i < arr.length; i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;

            nodelete = Math.max(arr[i], nodelete + arr[i]);

            int val = 0;
            if(prevonedelete == Integer.MIN_VALUE){
                val = arr[i];
            }
            else{
                val = prevonedelete + arr[i];
            }

            onedelete = Math.max(val, prevnodelete);

            ans = Math.max(Math.max(nodelete, onedelete), ans);

        }

        return ans;
    }

}