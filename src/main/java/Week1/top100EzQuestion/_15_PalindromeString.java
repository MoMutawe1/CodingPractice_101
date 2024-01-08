package Week1.top100EzQuestion;

// How do you check whether a string is a palindrome in Java?
public class _15_PalindromeString {
    public static void main(String[] args) {
        String str = "race car  ";
        System.out.println(palindromeCheck(str));
    }

    private static boolean palindromeCheck(String str) {
        int first = 0;
        int last = str.length()-1;

        while(first < last){
            if(str.charAt(first) == ' ') {
                first++;
                continue;
            }
            if(str.charAt(last) == ' '){
                last--;
                continue;
            }
            if(str.charAt(first) != str.charAt(last))
                return false;

            first++;
            last--;
        }
        return true;
    }
}
