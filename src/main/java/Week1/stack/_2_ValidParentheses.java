package Week1.stack;

import java.util.Stack;

public class _2_ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> myStack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='{' || c=='[' || c=='(')
                myStack.push(c);
            else if(!myStack.isEmpty() && myStack.peek()=='{' && c == '}')
                myStack.pop();
            else if(!myStack.isEmpty() && myStack.peek()=='[' && c == ']')
                myStack.pop();
            else if(!myStack.isEmpty() && myStack.peek()=='(' && c == ')')
                myStack.pop();
            else return false;
        }
        return myStack.isEmpty();
    }
}
