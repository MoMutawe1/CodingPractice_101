package Week1.top100EzQuestion;

import java.util.ArrayList;

public class _13_RemoveArrayDuplicates {

    public static void main(String[] args) {
        int[] sortedArr = {1, 3, 3, 5, 6, 8, 8, 12};
        System.out.println(removeDuplicates(sortedArr));
    }

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : nums){
            if(!result.contains(i))
                result.add(i);
        }
        System.out.println(result);
        return result.size();
    }
}
