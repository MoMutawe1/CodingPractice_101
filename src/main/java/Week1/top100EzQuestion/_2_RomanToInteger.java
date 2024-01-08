package Week1.top100EzQuestion;

import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/
public class _2_RomanToInteger {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV")); // 1994
    }

    public static int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for(int i=0; i<s.length(); i++){
            if(romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i+1))){
                result += romanMap.get(s.charAt(i));
            } else {
                result +=  romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
                i++;
            }
        }
        return result;
    }
}
