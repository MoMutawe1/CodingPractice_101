package Week1.top100EzQuestion;

// https://leetcode.com/problems/reverse-string/
public class _11_ReverseString {

    public static void main(String[] args) {
        char[] charArr = {'H','a','n','n','a','h'};
        System.out.println(reverseString1(charArr));
        System.out.println(reverseString2(charArr));
    }

    // approach 1
    public static String reverseString1(char[] charArr) {
        StringBuilder result = new StringBuilder();
        for(int i=charArr.length-1; i>=0; i--){
            result.append(charArr[i]);
        }

        return result.toString();
    }

    // approach 2
    public static char[] reverseString2(char[] charArr) {
        int first = 0;
        int last = charArr.length-1;

        while(first < last){
            char temp = charArr[first];
            charArr[first] = charArr[last];
            charArr[last] = temp;
            first++;
            last--;
        }
        return charArr;
    }
}
