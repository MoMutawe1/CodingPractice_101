package Week1.top100EzQuestion;

import java.util.ArrayList;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,7,8,8,10};
        int[] result = searchRange(arr, 8);
        for(int i: result)
            System.out.print(i+" ");
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] resultsArr=new int[]{-1,-1};
        if(nums.length==0) return resultsArr;
        int start=0, end=nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(nums[mid]>=target)
                end = mid;
            else
                start = mid+1;
        }

        if(nums[start] != target) return resultsArr;

        resultsArr[0] = start;
        end = nums.length;

        while(start<end){
            int mid = start + (end-start)/2;

            if(nums[mid] > target)
                end=mid;
            else
                start = mid +1;
        }

        resultsArr[1] = start -1;
        return resultsArr;
    }
}
