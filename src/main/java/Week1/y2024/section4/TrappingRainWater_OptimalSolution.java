package Week1.y2024.section4;

//https://leetcode.com/problems/trapping-rain-water/description/
public class TrappingRainWater_OptimalSolution {

    public static void main(String[] args) {
        int[] inputsArr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(inputsArr));
    }

    public static int trap(int[] inputsArr) {

        int left = 0, maxLeft = 0;
        int right = inputsArr.length-1, maxRight = inputsArr.length-1;
        int area = 0;

        while(left < right){
            if(inputsArr[maxLeft] <= inputsArr[maxRight]){
                left++;
                if(inputsArr[left] > inputsArr[maxLeft])
                    maxLeft = left;
                else
                    area += inputsArr[maxLeft] - inputsArr[left];
            } else {
                right--;
                if(inputsArr[right] > inputsArr[maxRight])
                    maxRight = right;
                else
                    area += inputsArr[maxRight] - inputsArr[right];
            }
        }
        return area;
    }
}
