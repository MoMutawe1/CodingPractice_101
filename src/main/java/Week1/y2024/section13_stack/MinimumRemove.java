package Week1.y2024.section13_stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses
public class MinimumRemove {

    public static void main(String[] args) {
        //System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(minRemoveToMakeValid("le((e(t(c)o)de"));
    }

    public static String minRemoveToMakeValid(String s) {
        Set<Integer> indexesToRemove = new HashSet<>(); // track the indexes of '('
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    indexesToRemove.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        // Put any indexes remaining on stack into the set.
        while (!stack.isEmpty()) indexesToRemove.add(stack.pop());
        StringBuilder sb = new StringBuilder(); // mutable
        for (int i = 0; i < s.length(); i++) {
            if (!indexesToRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
