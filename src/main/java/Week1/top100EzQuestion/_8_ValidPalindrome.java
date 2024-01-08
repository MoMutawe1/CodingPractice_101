package Week1.top100EzQuestion;

// https://leetcode.com/problems/valid-palindrome/
public class _8_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        int x = 0, y = s.length()-1;

        while (x < y){
            if(!Character.isLetter(s.charAt(x)))
                x++;
            else if(!Character.isLetter(s.charAt(y)))
                y--;
            else if(Character.toUpperCase(s.charAt(x)) != Character.toUpperCase(s.charAt(y)))
                return false;
            else {
                x++;
                y--;
            }
        }
        return true;
    }
}
