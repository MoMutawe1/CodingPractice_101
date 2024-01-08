package Week1.map;

import java.util.HashMap;
import java.util.Map;

public class _1_SingleNumber {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i: nums)
            myMap.put(i, myMap.getOrDefault(i, 0) + 1);

        for (Map.Entry<Integer, Integer> m : myMap.entrySet()) {
            if (m.getValue() == 1)
                return m.getKey();
        }
        return -1;
    }
}
