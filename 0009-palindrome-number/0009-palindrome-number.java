class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int sum = 0;

        int num = x;

        while(num != 0){

            int temp = num % 10;
            sum = sum * 10 + temp;
            num /= 10;

        }

        if(sum != x){
            return false;
        }

        return true;
      

        
    }
}