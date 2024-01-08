package Week1.y2024.section5;

import java.util.Stack;

// https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare {

    public static void main(String[] args) {
        String str1 = "ab#c", str2 = "ad#c";
        System.out.println(backspaceCompare(str1, str2));
    }

    public static boolean backspaceCompare(String str1, String str2) {
        Stack<Character> resultStack1 = new Stack<>();
        Stack<Character> resultStack2 = new Stack<>();

        for(char c: str1.toCharArray()){
            if(resultStack1.isEmpty()==true && c=='#')
                continue;
            else if(!resultStack1.isEmpty() && c=='#')
                resultStack1.pop();
            else
                resultStack1.push(c);
        }

        for(char c: str2.toCharArray()){
            if(resultStack2.isEmpty()==true && c=='#')
                continue;
            else if(!resultStack2.isEmpty() && c=='#')
                resultStack2.pop();
            else
                resultStack2.push(c);
        }

        return resultStack1.equals(resultStack2) ? true : false;
    }
}
