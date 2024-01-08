package Week1.map;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
public class _3_TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> myMap = new HashMap<>();
        int[] result = new int[2];

        for(int i=0; i< nums.length; i++){
            if(myMap.containsKey(target-nums[i])) {
                return new int[] {i, myMap.get(target-nums[i])};
            }
            myMap.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
