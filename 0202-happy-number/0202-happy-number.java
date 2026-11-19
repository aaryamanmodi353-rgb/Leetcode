class Solution {

    public int findNum(int num){
        int sum = 0;
        
        while(num > 0){
            int temp = num % 10;
            sum += Math.pow(temp, 2);
            num /= 10;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;

        while(fast != 1){

            slow = findNum(slow);
            fast = findNum(fast);
            fast = findNum(fast);

            if(slow == fast && slow == 1){
              return true;
            }
            if(slow == fast && slow != 1){
                return false;
            }
        }

        return true;
        
    }
}