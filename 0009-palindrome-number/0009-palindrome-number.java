class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int num = x;

        int sum = 0;

        while(num > 0){

            
            sum = sum * 10 + num % 10;
            num = num / 10;



        }

        if(sum != x){
            return false;
        }

        return true;
        
    }
}