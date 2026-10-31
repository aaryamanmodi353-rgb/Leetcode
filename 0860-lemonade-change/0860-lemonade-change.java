class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0;
        int ten = 0;
        int twenty = 0;

        int i = 0;
        for(i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                five++;
            }

            if(bills[i] == 10){
                if(five >= 1){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            if(bills[i] == 20){
                if(ten >= 1 && five >= 1){
                    five--;
                    ten--;
                    twenty++;
                }
                else if(five >= 3){
                    five -= 3;
                    twenty++;
                }

                else{
                    return false;
                }
            }
        }

        return true;
    }
}