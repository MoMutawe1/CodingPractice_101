package Week1.y2024.section6;

import java.util.HashMap;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.length()<=1) return s.length();
        HashMap<Character, Integer> longestStr = new HashMap<>();
        int maxLength=0;

        for(int i=0; i<s.length(); i++){
            if(longestStr.containsKey(s.charAt(i))) {
                i = longestStr.get(s.charAt(i))+1;
                if(longestStr.size() > maxLength) maxLength = longestStr.size();
                longestStr.clear();
            }
            longestStr.put(s.charAt(i),i);
        }

        return maxLength < longestStr.size() ? longestStr.size() : maxLength;
    }
}
