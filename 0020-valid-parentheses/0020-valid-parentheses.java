class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stk.add(ch);
                continue;
            }
            
            if(!stk.isEmpty() && ch == ')' && stk.peek() == '('){
                stk.pop();
            }
            else if(!stk.isEmpty() && ch == '}' && stk.peek() == '{'){
                stk.pop();
            }
           else if(!stk.isEmpty() && ch == ']' && stk.peek() == '['){
                stk.pop();
            }
           else{
            return false;
        

            }

        }

        return stk.isEmpty();




     
       

       
        
    }
}