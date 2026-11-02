class Solution {
    public boolean isPalindrome(int x) {

        int num = x;

        int sum = 0;

        while(num > 0){

            int temp = num % 10;
            sum = sum * 10 + temp;
            num = num / 10;



        }

        if(sum != x){
            return false;
        }

        return true;
        
    }
}