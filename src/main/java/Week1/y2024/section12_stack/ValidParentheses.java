package Week1.y2024.section12_stack;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else {
                if(c == '}' && stack.isEmpty()==false && stack.peek()=='{')
                    stack.pop();
                else if(c == ']' && stack.isEmpty()==false && stack.peek()=='[')
                    stack.pop();
                else if(c == ')' && stack.isEmpty()==false && stack.peek()=='(')
                    stack.pop();
                else return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
