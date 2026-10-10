class Solution {

    public void countPalindrome(String s, int index, List<String> lst, List<List<String>> res){
         
         if(index == s.length()){
            res.add(new ArrayList<>(lst));
            return;
         }

         for(int j = index; j < s.length(); j++){
            if(isValidPalindrome(s, index, j)){
                lst.add(s.substring(index, j + 1));
                countPalindrome(s, j + 1, lst, res);
                lst.remove(lst.size() - 1);
            }
         }
    }


    public static boolean isValidPalindrome(String s, int x, int y){
        while(x <= y){
            if(s.charAt(x) != s.charAt(y)){
                return false;
            }
            x++;
            y--;
        }

        return true;
    }
    public List<List<String>> partition(String s) {
        
        List<String> lst = new ArrayList<>();

        List<List<String>> res = new ArrayList<>();

        countPalindrome(s, 0, lst, res);

        return res;

    }
}