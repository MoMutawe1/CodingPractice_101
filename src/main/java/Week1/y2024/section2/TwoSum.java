package Week1.y2024.section2;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] inputs = { 5, 13, 22, 16, 3};
        int target = 8;
        System.out.println(Arrays.toString(findTarget(inputs, target)));
    }

    public static int[] findTarget(int[] inputs, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] resultArr = new int[2];

        for(int i=0; i< inputs.length; i++){
            map.put(inputs[i], i);
        }

        for(int i=0; i<inputs.length; i++){
            if(map.containsKey(target - inputs[i])){
                resultArr[0] = i;
                resultArr[1] = map.get(target - inputs[i]);
                return resultArr;
            }
        }
        return new int[] {-1, -1};
    }
}
