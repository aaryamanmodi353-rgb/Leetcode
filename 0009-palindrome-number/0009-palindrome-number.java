class Solution {
    public boolean isPalindrome(int x) {
        int temp =0;
        int sum =0;
        if(x<0){
            return false;
        }
         int num =x;
        while(num!=0){
            temp = num%10;
            sum  = sum*10+temp;
            num /= 10;
        }
        if(sum == x){
            return true;
        }
        return false;
        
    }
}