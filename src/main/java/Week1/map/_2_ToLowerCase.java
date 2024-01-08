package Week1.map;

import java.util.HashMap;

// https://leetcode.com/problems/to-lower-case/
public class _2_ToLowerCase {

    public static void main(String[] args) {
        System.out.println(toLowerCase1("SASAGEYO"));
        System.out.println(toLowerCase2("SASAGEYO"));
        System.out.println(toLowerCase3("SASAGEYO"));
    }

    // Solution 1
    public static String toLowerCase1(String s) {
        return s.toLowerCase();
    }

    // Solution 2
    public static String toLowerCase2(String s){
        String result = "";
        for(char c: s.toCharArray()) {
            if (Character.isUpperCase(c))
                result += (char) (c + 32);
            else result += c;
        }
        return result;
    }

    // Solution 3
    public static String toLowerCase3(String s) {
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";

        HashMap<Character, Character> myMap = new HashMap<>();
        for(int i=0; i<26; i++)
            myMap.put(upperChars.charAt(i), lowerChars.charAt(i));

        for(char c: s.toCharArray())
            if(Character.isUpperCase(c))
                result += myMap.get(c);
            else{
                result += c;
            }
        return result;
    }
}
