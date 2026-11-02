class Solution {
    public boolean palindromeString(String s, int start, int end){
       
        if(start >= end){
            return true;
        }

        
        
        if(!Character.isLetterOrDigit(s.charAt(start))){
            return palindromeString(s, start + 1, end);
        }
        if(!Character.isLetterOrDigit(s.charAt(end))){
            return palindromeString(s, start, end - 1);
        }

        if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
           return false;
        }

        return palindromeString(s, start + 1, end - 1);

        

        
        

    }
    public boolean isPalindrome(String s) {
        
        return palindromeString(s, 0, s.length() - 1);
    }
}