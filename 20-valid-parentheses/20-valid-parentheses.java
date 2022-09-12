class Solution {
    public boolean isValid(String s) {
        //every opening parenthesis will have a closing, hence a valis string should have even no. of characters in the string
        if(s.length()%2!=0)
            return false;
        else 
        {
            Stack<Character> stack = new Stack(); 
            for(int i = 0; i<s.length(); i++)
            {
                char c = s.charAt(i);
                if(c=='(' || c=='{' || c=='[')
                    stack.push(c); //push opening parenthesis onto stack 
                else if(c==')' && !stack.isEmpty() && stack.peek()=='(')
                    stack.pop();
                else if(c=='}' && !stack.isEmpty() && stack.peek()=='{')
                   stack.pop();
               else if(c==']' && !stack.isEmpty() && stack.peek()=='[')
                   stack.pop(); 
                else 
                    stack.add(s.charAt(i));
                }
            return stack.isEmpty(); //stack should be empty at the end if its a valid string
        }
    }   
}