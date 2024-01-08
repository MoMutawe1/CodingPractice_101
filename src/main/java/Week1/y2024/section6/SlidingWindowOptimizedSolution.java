package Week1.y2024.section6;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class SlidingWindowOptimizedSolution {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length(), longestStr = 0;
        Map<Character, Integer> map = new HashMap<>();
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < length; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            longestStr = Math.max(longestStr, j - i + 1);
            map.put(s.charAt(j), j + 1); // save each char with their position+1 (directly after the duplicate char by 1)
        }
        return longestStr;
    }
}
