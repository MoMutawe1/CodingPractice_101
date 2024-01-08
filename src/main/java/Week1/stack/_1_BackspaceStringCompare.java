package Week1.stack;

import java.util.Stack;

// https://leetcode.com/problems/backspace-string-compare/
public class _1_BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '#' && stack1.isEmpty()==false)
                stack1.pop();
            stack1.add(c);
        }

        for(char c: t.toCharArray()){
            if(c == '#' && stack2.isEmpty()==false)
                stack2.pop();
            stack2.add(c);
        }

        return stack1.equals(stack2);
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }
}
